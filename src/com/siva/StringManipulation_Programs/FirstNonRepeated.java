package com.siva.StringManipulation_Programs;

public class FirstNonRepeated {
	public static void main(String[] args) {
		String str = "siva";
		boolean[] visited = new boolean[str.length()]; // Array to keep track of visited characters

		// Iterate through each character
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			boolean isRepeated = false;

			// Check if this character is repeated later in the string
			for (int j = i + 1; j < str.length(); j++) {
				if (currentChar == str.charAt(j)) {
					isRepeated = true;
					visited[j] = true; // Mark this character as repeated
					break;
				}
			}

			// If the character is not repeated, and it has not been visited, print it
			if (!isRepeated && !visited[i]) {
				System.out.println("First Non-Repeated Character: " + currentChar);
				break;
			}
		}
	}
}
