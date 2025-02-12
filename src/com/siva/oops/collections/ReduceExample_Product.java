package com.siva.oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExample_Product {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 4, 5);
		Stream<Integer> stream = nums.stream();

		Optional<Integer> product = stream.reduce((a, b) -> a * b);
		System.out.println("Product: " + product.get());

	}

}
