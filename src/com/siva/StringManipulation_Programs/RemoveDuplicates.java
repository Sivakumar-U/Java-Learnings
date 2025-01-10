package com.siva.StringManipulation_Programs;

// Program to Remove Duplicates from a String
public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "programming";
		String result = "";

		// Iterate through the original string
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			// Check if the character is already in the result string
			if (result.indexOf(currentChar) == -1) {
				result += currentChar; // Add the character to the result
			}
		}

		System.out.println("String without Duplicates: " + result);
	}

}
