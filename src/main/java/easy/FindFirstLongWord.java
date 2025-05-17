package easy;

import java.util.Arrays;
import java.util.List;

public class FindFirstLongWord {

/*
	Find First Long Word:
	Given a list of strings, use the Stream API to find the first string with a length greater than 5 characters.
	Return an empty string if no such string exists.
 */
	
	public static String find(List<String> words){
		return words.stream()
			       .filter(word -> word.length()>5)
			       .findFirst()
			       .orElse("");
	}
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("cat", "dog", "apple", "banana", "fig", "grape", "watermelon", "kiwi", "pear");
		
		System.out.println(find(words));
	}
}
