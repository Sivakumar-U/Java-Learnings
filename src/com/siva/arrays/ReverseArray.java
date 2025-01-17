package com.siva.arrays;

// Print the integers of array in reverse order.
public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 34, 32, 45, 21, 67, 29 };
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.println(arr[i]);

	}

}
