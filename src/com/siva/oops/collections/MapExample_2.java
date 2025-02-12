package com.siva.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Program to print square values of each element in list using map().
 */
public class MapExample_2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 3, 7, 4, 6, 9));
		Stream<Integer> stream = list.stream();

		// Square values of each element in list.
		List<Integer> squares = stream.map(x -> x * x).collect(Collectors.toList());
		squares.forEach(System.out::println);

	}

}
