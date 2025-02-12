package com.siva.oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * program to print the First Non-Empty String.
 */
public class ReduceExample_FirstNonEmpty {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("", "", "Siva", "Java", "Streams", "API");
		Stream<String> stream = words.stream();

		Optional<String> firstNonEmpty = stream.reduce((a, b) -> !a.isEmpty() ? a : b);
		System.out.println("First Non-Empty String: " + firstNonEmpty.get());

	}

}
