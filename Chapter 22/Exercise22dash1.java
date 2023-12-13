package AlgEtc;

import java.util.Scanner;


/*
 * Pretty sure this one is O(n) (linear) time complexity 
 * 
 */
public class Exercise22dash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String test = input.nextLine();
		
		System.out.printf("The longest consecutive substring is: \"%s\"", findOrderedSubstring(test));

	}
	
	public static String findOrderedSubstring(String string) {

		char[] chars = findOrderedSubstring(string.toCharArray());
		
		String result = "";
		
		for (int c = 0; c < chars.length; c++) {
			
			result += chars[c];
		}
		
		return result;
	}
	
	public static char[] findOrderedSubstring(char[] chars) {

		if (chars.length <= 2) {
			
			return chars;
		}
		
		int index = 0;
		
		int length = 1;
		int streak = 1;	
		
		for (int c = 0; c < (chars.length - 1); c++) {
			
			if (chars[c] <= chars[c + 1]) {

				streak++;
				
				if (streak > length) {
				
					length = streak;
					index = ((c - length) + 2);
				
				} else {}
			
			} else {
				
				streak = 1;
				
				if ((chars.length - c) < length) {
					//kills the loop if there is less space remaining than could contain a longer string
					c = chars.length;
				} else {}
			}	
		}
		
		char[] result = new char[length];
		
		for (int i = 0; i < length; i++) {
			
			result[i] = chars[i + index];
		}
		
		
		return result;
		
	}

}
