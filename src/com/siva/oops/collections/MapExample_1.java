package com.siva.oops.collections;

/*
 * Map():It takes every item in a list, applies a rule or function to it, 
 * and gives back a new list with the updated items.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Program to print double value of each element in list using map() method.
 */
public class MapExample_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 7, 9));
		Stream<Integer> stream = list.stream();

		List<Integer> doubles = stream.map(x -> x + x).collect(Collectors.toList());
		doubles.forEach(System.out::println);

	}

}
