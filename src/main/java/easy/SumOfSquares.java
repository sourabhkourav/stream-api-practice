package easy;

import java.util.Arrays;

public class SumOfSquares {

/*
	Sum of Squares:
	Given an array of integers, use the Stream API to compute the sum of the squares of all positive numbers.
 */
	
	public static int compute(int[] numbers){
		return Arrays.stream(numbers).filter(number -> number>0).map(number -> number*number).sum();
	}
	
	public static void main(String[] args) {
		int[] numbers = {3, -1, 4, 0, -5, 6, 2, -8, 7, -3, 5};
		System.out.println(compute(numbers));
	}
}
