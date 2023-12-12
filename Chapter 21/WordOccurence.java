package AlgEtc;

public class WordOccurence implements Comparable<WordOccurence> {

	private String word;
	
	private int count;
	
	WordOccurence(String word) {
		
		this(word, 1);
	}
	
	WordOccurence(String word, int count) {
		
		this.word = word;
		this.count = count;
	}
	
	public String getWord() {
		
		return word;
	}
	
	public int getCount() {
		
		return count;
	}
	
	public void upCount() {
		
		count++;
	}
	
	@Override
	public int compareTo(WordOccurence comp) {
		// TODO Auto-generated method stub
		if (this.count > comp.getCount()) {
			
			return 1;
		} else if (this.count == comp.getCount()) {
			
			return 0;
		} else {
			
			return -1;
		}
	}
}
