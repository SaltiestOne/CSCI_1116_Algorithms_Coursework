package AlgEtc;

class Exercise24_03 {
	public static void main(String[] args) {
		TwoWayLinkedList<Integer> list = new TwoWayLinkedList<Integer>();
		
		list.add(1);
		System.out.println(list.getLast());

		list.add(2);
		System.out.println(list.getLast());

		list.add(3);
		System.out.println(list.getLast());

		list.add(4);
		System.out.println(list.getLast());

		java.util.ListIterator<Integer> iterator = list.iterator();
		iterator.next();
		iterator.next();
		iterator.next();

		// System.out.print(iterator.next() + " ");

		System.out.println();
		while (iterator.hasPrevious()) {
			
			 System.out.print(iterator.previous() + " ");
		}
	}
}