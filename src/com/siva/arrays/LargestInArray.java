package com.siva.arrays;

// Find largest integer in Array.
public class LargestInArray {

	public static void main(String[] args) {
		int[] arr = { 34, 32, 45, 21, 67, 29 };
		int largestNum = arr[0];
		for (int num : arr) {
			if (num > largestNum)
				largestNum = num;
		}
		System.out.println("The Largest integer in the Array: " + largestNum);

	}

}
