package com.siva.StringManipulation_Programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		// Step 1: Remove spaces and convert both strings to lower case for uniformity
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// Step 2: Check if lengths are the same
		if (str1.length() != str2.length()) {
			System.out.println("The strings are not anagrams.");
			return;
		}

		// Step 3: Convert strings to character arrays and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Step 4: Compare sorted character arrays
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
}
