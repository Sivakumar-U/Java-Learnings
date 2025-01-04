package com.siva;

public class ForLoopExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "Hello", "siva", "How", "Are", "you" };

		//Iterating elements using for loop
		for (int i = 0; i <= words.length - 1; i++) {
			System.out.println("word at index " + i + " is " + words[i]);
		}

		//Iterating elements using for each (Direct iterating)
		for (String word : words) {
			System.out.println(word);
		}

	}

}
