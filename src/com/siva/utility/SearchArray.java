package com.siva.utility;

public class SearchArray {

	public static int search(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int target = 5;
		int index = search(array, target);
		if (index != -1) {
			System.out.println("Element " + target + " found at index " + index);
		} else {
			System.out.println("Element " + target + " not found in the array");
		}
	}
}
