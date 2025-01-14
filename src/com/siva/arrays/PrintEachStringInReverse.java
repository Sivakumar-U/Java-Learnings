package com.siva.arrays;

// Display each string in the array in reverse order.
public class PrintEachStringInReverse {

	public static void main(String[] args) {
		String[] arr = { "Mahesh", "Venkatesh", "Arjun", "Charan", "NTR" };
		for (String str : arr) { // Iterate over each string in the array
			String Reversed = ""; // Initialize an empty string to store the reversed version
			for (int i = str.length() - 1; i >= 0; i--) { // Reverse the string character by character
				Reversed = Reversed + str.charAt(i);

			}
			System.out.println("Original: " + str + " | Reversed: " + Reversed); // Print the reversed string
		}

	}

}
