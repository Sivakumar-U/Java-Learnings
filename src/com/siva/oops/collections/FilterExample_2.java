package com.siva.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * program to print elements which are greater than 5 in a list using filter().
 */
public class FilterExample_2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 4, 7, 2, 9, 4, 6));
		Stream<Integer> stream = list.stream();

		List<Integer> greater = stream.filter(x -> x > 5).collect(Collectors.toList());
		greater.forEach(System.out::println);

	}

}
