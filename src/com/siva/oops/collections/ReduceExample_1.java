package com.siva.oops.collections;

/*
 * Reduce(): It is a method that combines all the items in a stream into a one single result.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Program to print sum of values in the list using reduce() method.
 */
public class ReduceExample_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 3, 7, 2, 9, 4, 6));
		Stream<Integer> stream = list.stream();

		Optional<Integer> sum = stream.reduce((a, b) -> a + b); // called Accumulator.
		System.out.println(sum.get());

	}

}
