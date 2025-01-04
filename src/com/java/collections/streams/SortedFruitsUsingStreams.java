package com.java.collections.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFruitsUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Guava", "Saporta", "Pineapple");

		// Sort stream in ascending order
		List<String> sortedFruits = fruits.stream()
				.sorted()
				.collect(Collectors.toList());
		
		// Sort a stream in ascending order using Comparator
		List<String> sortedFruitsUsingComparator = fruits.stream()
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());

		// Sort stream in reverse order using Comparator
		List<String> sortedFruitsReverse = fruits.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		// Sort by length of string
		List<String> sortedFruitsUsingLength = fruits.stream()
				.sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());

		sortedFruits.forEach(System.out::println);

		System.out.println("======================================");
		sortedFruitsUsingComparator.forEach(System.out::println);

		System.out.println("======================================");
		sortedFruitsReverse.forEach(System.out::println);
		
		System.out.println("======================================");
		sortedFruitsUsingLength.forEach(System.out::println);

	}

}
