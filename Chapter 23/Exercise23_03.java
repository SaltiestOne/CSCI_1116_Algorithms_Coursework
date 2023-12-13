package AlgEtc;
/*


Author: 
Date: 

Description: 
*/
import java.util.Comparator;

public class Exercise23_03 {
  
	public static void main(String[] args) {
	    
		Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
	    
		quickSort(list);
	    
		for (int i = 0; i < list.length; i++) {
	      System.out.print(list[i] + " ");
	    }
	
	    System.out.println();
	    
	    Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
	                     new Circle(5), new Circle(6), new Circle(1), new Circle(2),
	                     new Circle(3), new Circle(14), new Circle(12)};
	    
	    quickSort(list1, new GeometricObjectComparator());
	    
	    for (int i = 0; i < list1.length; i++) {
	      System.out.println(list1[i] + " ");
	    }
	}
	
	public static <E extends Comparable<E>> void quickSort(E[] list) {
		
		quickSort(list, ((e, a) -> {
			return e.compareTo(a);})); 
		//this is less efficient in terms of resources, but more efficient in terms of my time
		
	}
	
	public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
		
		if (list.length == 2) {
			//base case
			if (comparator.compare(list[0], list[1]) >= 1) {
				
				E train = list[0];
				
				list[0] = list[1];
				
				list[1] = train;
			}
		} else if (list.length <= 1) {
			//do nothing, an array of length one is already sorted by default
			
		} else {
			
			int pivotPoint = (int)(list.length / 2);
			
			E pivot = list[pivotPoint];
			
			//if greater than pivot, move to right
	
			for (int l = (pivotPoint - 1); l >= 0; l--) {
				
				if (comparator.compare(list[l], pivot) >= 1) {
					
					E train = list[l];
					
					for (int t = l; t < pivotPoint; t++) {
						
						list[t] = list[t + 1];
					}
				
					list[pivotPoint--] = train;
				} else {}
			}
				
			for (int g = (pivotPoint + 1); g < list.length; g++) {
			//if less than pivot, move to left
				if (comparator.compare(list[g], pivot) <= -1) {
					
					E train = list[g];
					
					for (int t = g; t > pivotPoint; t--) {
						
						list[t] = list[t - 1];
					}

					list[pivotPoint++] = train;
				} else {}
			}
			
			//sort left
			E[] lesses = (E[])new Object[pivotPoint];
			
			for (int l = 0; l < pivotPoint; l++) {
				
				lesses[l] = list[l];
			}
			
			quickSort(lesses, comparator);
			
			//sort right
			E[]	greaters = (E[])new Object[list.length - pivotPoint - 1];
			
			for (int g = 0; g < greaters.length; g++) {
				
				greaters[g] = list[g + pivotPoint + 1];
			}
			
			quickSort(greaters, comparator);
			
			//add left, pivot, right
			for (int l = 0; l < pivotPoint; l++) {
				
				list[l] = lesses[l];
			}
			
			for (int g = 0; g < greaters.length; g++) {
				
				list[g + pivotPoint + 1] = greaters[g];
			}
		}
		
		
	}
}