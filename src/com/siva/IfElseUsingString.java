package com.siva;

import java.util.Scanner;

public class IfElseUsingString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");

		String input = scanner.nextLine();

		// Check if the input matches "java", "JAVA", "Java", or "JaVa"
		if (input.equalsIgnoreCase("java")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		scanner.close();
	}

}
