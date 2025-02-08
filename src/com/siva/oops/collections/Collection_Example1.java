package com.siva.oops.collections;

// Array of integers.
public class Collection_Example1 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println("Array is: ");
		for (int x : arr) {
			System.out.println(x);
		}

	}

}
