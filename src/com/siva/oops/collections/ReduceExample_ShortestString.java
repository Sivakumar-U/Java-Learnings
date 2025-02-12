package com.siva.oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Program to print shortest string in stream using reduce method.
 */
public class ReduceExample_ShortestString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Spring", "Java", "Hibernate", "JS", "HTML");
		Stream<String> stream = list.stream();

		Optional<String> shortest = stream.reduce((s1, s2) -> s1.length() < s2.length() ? s1 : s2);
		System.out.println("Shortest string: " + shortest.orElse("No string found"));

	}

}
