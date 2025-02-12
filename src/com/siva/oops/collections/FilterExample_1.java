package com.siva.oops.collections;

/*
 * Filter(): It is a method that removes items from a list or collection based on a condition.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * program to print even numbers in the list using filter() method.
 */
public class FilterExample_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7, 9));
		Stream<Integer> stream = list.stream();

		List<Integer> evenNums = stream.filter(x -> x % 2 == 0).collect(Collectors.toList());
		evenNums.forEach(System.out::println);

	}

}
