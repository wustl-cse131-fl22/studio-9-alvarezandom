package studio9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import support.cse131.NotYetImplementedException;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		Map<String, Integer> countWords = new HashMap<>();
		
		for (String key : words) {
			if(key.equals(words.get())) {
				int value = 1;
				countWords.put(key, value++);
			} else
				countWords.put(key, 1);
			
			System.out.println(countWords);
		}
		return countWords;
	}
}
