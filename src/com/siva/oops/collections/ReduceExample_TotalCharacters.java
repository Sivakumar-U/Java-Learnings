package com.siva.oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Program to print a Count Total Characters in a List of Strings 
 */
public class ReduceExample_TotalCharacters {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Streams", "API", "SQL");
		Stream<Integer> stream = list.stream().map(String::length);

		Optional<Integer> totalCharacters = stream.reduce((a, b) -> a + b);
		System.out.println("Total Characters: " + totalCharacters.get());

	}

}
