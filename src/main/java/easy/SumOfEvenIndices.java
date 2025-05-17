package easy;

import java.util.stream.IntStream;

public class SumOfEvenIndices {

/*
	Sum of Even Indices:
	Given an array of integers, use IntStream to compute the sum of numbers at even indices (0-based indexing).
	Return 0 for an empty array.
 */
	public static int compute(int[] numbers){
		return IntStream.range(0, numbers.length)
			       .filter(index-> index%2==0)
			       .map(index-> numbers[index])
			       .sum();
	}
	
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50, 60, 70};
		
		System.out.println(compute(numbers));
	}
}
