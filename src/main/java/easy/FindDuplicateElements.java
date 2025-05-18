package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElements {

/*
	Find Duplicate Elements:
	Given a list of integers, use the Stream API to find all elements that appear more than once.
	Return a list of these duplicate elements without repetition (i.e., each duplicate appears only once).
 */
	public static List<Integer> find(List<Integer> numbers){
		return numbers.stream()
			       .collect(Collectors.groupingBy(num-> num, Collectors.counting()))
			       .entrySet().stream()
			       .filter(entry-> entry.getValue() > 1)
			       .map(Map.Entry::getKey)
			       .collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 5, 7, 3, 9, 1, 5, 5, 11, 13, 3);
		
		System.out.println(find(numbers));
	}
}
