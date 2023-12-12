package AlgEtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Exercise21dash7 {

	public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " +
		"Have a good visit. Have fun!";
		// Create a TreeMap to hold words as key and count as value
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<WordOccurence> wordies = new ArrayList<WordOccurence>();
		
		String[] words = text.split("[\\s+\\p{P}]");
		
		for (int i = 0; i < words.length; i++) {
			
			String key = words[i].toLowerCase();
				
			if (key.length() > 0) {
					
				if (!map.containsKey(key)) {
					
					map.put(key, 1);
				} else {
					
					int value = map.get(key);
					
					value++;
					
					map.put(key, value);
				}
			} else {}
		}
		
		map.forEach((s, i)-> {
			
			wordies.add(new WordOccurence(s, i));
		});
		
		Collections.sort(wordies);
		
		wordies.forEach(w -> {
			
			System.out.printf("%s occurs %d times.\n", w.getWord(), w.getCount());});
		}
}
