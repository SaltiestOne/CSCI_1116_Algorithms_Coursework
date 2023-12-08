package AlgEtc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise20dash3 {
  
	public static void main(String[] args) {
    
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
    
    ArrayList<StateCapital> staycaps = new ArrayList<StateCapital>();
    
    for (int s = 0; s < stateCapital.length; s++) {
    	
    	
    	
    	staycaps.add(new StateCapital(stateCapital[s][0], stateCapital[s][1]));
    }

    Scanner input = new Scanner(System.in);
    
    int correctCount = 0;

    while (!staycaps.isEmpty()) {
      // Prompt the user with a question
    	int index = new Random().nextInt(staycaps.size());
    	
    	System.out.printf("What is the capital of %s?\n", staycaps.get(index).getState());
    	
    	String capital = input.nextLine().trim().toLowerCase();
      
    	if (capital.toLowerCase().equals((staycaps.get(index).getCapital().toLowerCase()))) {
   
    		System.out.println("That's correct!");
 
    		correctCount++;
    	} else {
    	    
    		System.out.printf("Incorrect; it's %s.\n", staycaps.get(index).getCapital());
    	}     
    	
    	staycaps.remove(index);
    }

    System.out.printf("You guessed %s capitals correctly.", correctCount);
  }
}