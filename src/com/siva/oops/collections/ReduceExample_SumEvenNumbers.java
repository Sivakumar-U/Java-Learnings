package com.siva.oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Program to print Sum of Even Numbers Only.
 */
public class ReduceExample_SumEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		Stream<Integer> stream = list.stream().filter(x -> x % 2 == 0);

		Optional<Integer> sumEven = stream.reduce((a, b) -> a + b);
		System.out.println("Sum of Even Numbers: " + sumEven.orElse(0));

	}

}
