package AlgEtc;

import java.util.Random;
import java.util.Scanner;

public class Exercise24dash5 {

	public static void main(String[] args) {
		
		GenericQueue<Integer> test = new GenericQueue<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many random integers do you need? ");
		
		int numbs = input.nextInt();

		for (int q = 0; q < numbs; q++) {
			
			test.enqueue(new Random().nextInt(100));
		}
		
		System.out.printf("\nHere are your %d random integers:\n\n", test.getSize());
		
		while(!test.isEmpty()) {
			
			System.out.println(test.dequeue());
		}
		
		
	}
	
}