package easy;

import java.util.List;

public class FilterEvenNumbers {
/*
	Filter Even Numbers:
	Given a list of integers, use the Stream API to filter out all even numbers and return them in a new list
	sorted in ascending order.
*/
	public static List<Integer> filter(List<Integer> list){
		return list.stream().filter(number -> number%2==0).sorted().toList();
	}
	
	public static void main(String[] args) {
		List<Integer> listOfIntegers = List.of(1,2,3,4,5,6,7,8,9,0,1,22,432,6,34,73,446,77,7,8,67,36,478,89);
		System.out.println(filter(listOfIntegers));
	}
}
