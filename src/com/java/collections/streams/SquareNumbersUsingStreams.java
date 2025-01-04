package com.java.collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 4, 9, 16, 24, 36, 49, 64, 81, 100);

		List<Integer> squareNumbers = numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());

		System.out.println("Original numbers: " + numbers);
		System.out.println("Squared numbers: " + squareNumbers);

	}

}
