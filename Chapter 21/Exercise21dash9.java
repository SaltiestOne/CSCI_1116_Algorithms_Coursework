package AlgEtc;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise21dash9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> cappies = new HashMap<String, String>();
		
		String[][] stateCapital = {
			      {"Alabama", "Montgomery"},
			      {"Alaska", "Juneau"},
			      {"Arizona", "Phoenix"},
			      {"Arkansas", "Little Rock"},
			      {"California", "Sacramento"},
			      {"Colorado", "Denver"},
			      {"Connecticut", "Hartford"},
			      {"Delaware", "Dover"},
			      {"Florida", "Tallahassee"},
			      {"Georgia", "Atlanta"},
			      {"Hawaii", "Honolulu"},
			      {"Idaho", "Boise"},
			      {"Illinois", "Springfield"},
			      {"Indiana", "Indianapolis"},
			      {"Iowa", "Des Moines"},
			      {"Kansas", "Topeka"},
			      {"Kentucky", "Frankfort"},
			      {"Louisiana", "Baton Rouge"},
			      {"Maine", "Augusta"},
			      {"Maryland", "Annapolis"},
			      {"Massachusettes", "Boston"},
			      {"Michigan", "Lansing"},
			      {"Minnesota", "Saint Paul"},
			      {"Mississippi", "Jackson"},
			      {"Missouri", "Jefferson City"},
			      {"Montana", "Helena"},
			      {"Nebraska", "Lincoln"},
			      {"Nevada", "Carson City"},
			      {"New Hampshire", "Concord"},
			      {"New Jersey", "Trenton"},
			      {"New York", "Albany"},
			      {"New Mexico", "Santa Fe"},
			      {"North Carolina", "Raleigh"},
			      {"North Dakota", "Bismarck"},
			      {"Ohio", "Columbus"},
			      {"Oklahoma", "Oklahoma City"},
			      {"Oregon", "Salem"},
			      {"Pennsylvania", "Harrisburg"},
			      {"Rhode Island", "Providence"},
			      {"South Carolina", "Columbia"},
			      {"South Dakota", "Pierre"},
			      {"Tennessee", "Nashville"},
			      {"Texas", "Austin"},
			      {"Utah", "Salt Lake City"},
			      {"Vermont", "Montpelier"},
			      {"Virginia", "Richmond"},
			      {"Washington", "Olympia"},
			      {"West Virginia", "Charleston"},
			      {"Wisconsin", "Madison"},
			      {"Wyoming", "Cheyenne"}
		    };
		
		for (int c = 0; c < stateCapital.length; c++) {
			
			cappies.put(stateCapital[c][0], stateCapital[c][1]);
		}
		
		while (true) {
			
			System.out.print("Enter a state: ");
			
			System.out.printf("Its capital is %s.\n\n", cappies.get(input.nextLine()));
		}
		
		

	}

}
