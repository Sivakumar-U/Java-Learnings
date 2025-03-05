package com.siva.loop_examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintMissingElements_InArray {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 7, 9 };// Given Array

		// Find Min and Max values in the Array
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();

		// Convert array to a set for quick lookup
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		// Print missing numbers
		System.out.println("Missing Elements: ");
		for (int i = min; i <= max; i++) {
			if (!set.contains(i)) {
				System.out.println(i + " ");
			}
		}

	}

}
