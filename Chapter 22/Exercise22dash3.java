package AlgEtc;

import java.util.Scanner;
/*
 * I BELIEVE that this algorithm follows linear ( O(n) ) time complexity.
 * Correct me if I'm mistaken.
 * 
 * 
 */
public class Exercise22dash3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		
		String main = input.nextLine();
		
		System.out.print("Enter another String: ");
		
		String sub = input.nextLine();
		
		if (findSubstring(main, sub)) {
			
			System.out.printf("\"%s\" IS ", sub);
		} else {
			
			System.out.printf("\"%s\" is NOT ", sub);
		}
		
		System.out.printf("a substring of \"%s.\"", main);
		
	}
	
	
	public static boolean findSubstring(String main, String sub) {
		
		return findSubstring(main.toCharArray(), sub.toCharArray());		
	}
	
	public static boolean findSubstring(char[] main, char[] sub) {
		
		if (sub.length > main.length) {
			
			return false;
		} else {

			for (int m = 0; m <= (main.length - sub.length); m++) {
				
				boolean found = true;
				
				for (int s = 0; s < sub.length; s++) {
					
					if ((main[s + m] != sub[s])) {
						
						found = false;
						break;
					} else {}
				}
				
				if (found) {
					
					return true;
				} else {}
			}

			return false;	
		}
	}
}