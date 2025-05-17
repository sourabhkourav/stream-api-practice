package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TransformStringsToUppercase {

/*
	Transform Strings to Uppercase:
	Given a list of strings, use the Stream API to convert all strings to uppercase and collect them into a new list,
	excluding any strings shorter than 4 characters.
*/
	
	public static List<String> transform(List<String> wordsList){
		return wordsList.stream()
			       .filter(Objects::nonNull)
			       .filter(word -> word.length()>=4)
			       .map(String::toUpperCase)
			       .collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<String> wordsList = Arrays.asList(
	    "apple", "banana", null, "avocado", "blueberry", "apricot",
	    "blackberry", "cherry", "date", "banana", "apple", "fig",
	    "grape", null, "kiwi", "lemon", "lime", "mango", "nectarine",
	    "orange", "papaya", "pear", "quince", "raspberry", "strawberry",
	    "tangerine", "watermelon", "guava", "yellow", "fruit"
		);

		System.out.println(transform(wordsList));
	}
}
