package easy;

import java.util.Arrays;
import java.util.List;

public class CountTotalElements {
/*
	Count Total Elements:
	Given a list of integers, use the Stream API to count the total number of elements in the list and
	return the count as an integer.
 */
	public static int count(List<Integer> numbers){
		return (int)numbers.stream()
			       .count();
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
		System.out.println(count(numbers));
	}

}
