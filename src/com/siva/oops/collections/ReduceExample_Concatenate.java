package com.siva.oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Program to print words in a stream to concatenated sentence using reduce method.
 */
public class ReduceExample_Concatenate {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "is", "fun");
		Stream<String> stream = words.stream();

		Optional<String> sentence = stream.reduce((a, b) -> a + " " + b);

		System.out.println("Concatenated Sentence: " + sentence.orElse("No words found"));

	}

}
