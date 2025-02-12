package com.siva.oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Program to print largest number in a stream using reduce() method.
 */
public class ReduceExample_Max {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 5, 32, 18);
		Stream<Integer> stream = numbers.stream();

		Optional<Integer> max = stream.reduce((a, b) -> a > b ? a : b);

		System.out.println("Maximum: " + max.orElse(Integer.MIN_VALUE));

	}

}
