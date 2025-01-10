package com.siva.StringManipulation_Programs;

// program to check the vowels and replace that vowel to *.
public class ReplaceVowels {
	public static void main(String[] args) {
		String str = "hello world";
		String vowels = "aeiouAEIOU";
		char replacement = '*';

		// Convert string to character array
		char[] charArray = str.toCharArray();

		// Loop through the character array and replace vowels with '*'
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];

			// Check if the character is a vowel
			boolean isVowel = false;
			for (int j = 0; j < vowels.length(); j++) {
				if (c == vowels.charAt(j)) {
					isVowel = true;
					break;
				}
			}

			// If it's a vowel, replace with '*'
			if (isVowel) {
				charArray[i] = replacement;
			}
		}

		// Convert the character array back to a string
		String modifiedStr = new String(charArray);
		System.out.println("Modified String: " + modifiedStr);
	}
}
