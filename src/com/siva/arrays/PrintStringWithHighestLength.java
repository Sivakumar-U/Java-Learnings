package com.siva.arrays;

// Display String with Highest length
public class PrintStringWithHighestLength {

	public static void main(String[] args) {
		String[] arr = { "Siva", "Panduranga", "Vinayaka", "Venkateshwara", "Sai Baba" };
		String LongestString = arr[0];
		for (String str : arr) {
			if (str.length() > LongestString.length())
				LongestString = str;
		}
		System.out.println("Highest Length of string in Array: " + LongestString);

	}

}
