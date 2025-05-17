package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JoinStringsWithDelimiter {

/*
	Join Strings with Delimiter:
	Given a list of strings and a delimiter (e.g., ","), use the Stream API to filter out empty strings,
	convert non-empty strings to uppercase, and join them with the given delimiter into a single string.
 */
	
	public static String join(List<String> words, String delimiter){
		return words.stream()
			       .filter(Objects::nonNull)
			       .map(String::trim)
						 .filter(word -> !word.isEmpty())
			       .map(String::toUpperCase)
			       .collect(Collectors.joining(delimiter));
	}
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "", "banana", "grape", "", "mango", "kiwi", "", "orange", "pear");
		String delimiter = ", ";
		
		System.out.println(join(words,delimiter));

	}
	
}
