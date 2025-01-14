package com.siva.arrays;

// Display String with Least length.
public class PrintStringWithLeastLength {

	public static void main(String[] args) {
		String[] arr = { "Narayana", "Chaitanya", "MGM", "Master Minds" };
		String leastString = arr[0];
		for (String str : arr) {
			if (str.length() < leastString.length())
				leastString = str;
		}
		System.out.println("Least Lenght of String in Array: " + leastString);

	}

}
