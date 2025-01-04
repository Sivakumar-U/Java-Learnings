package com.siva;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Create Scanner object to get user input
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter a number
		System.out.println("Enter a number:");

		// Grab the user input
		int number = scanner.nextInt();

		// Check if the input number is a palindrome
		boolean isPalindrome = checkPalindrome(number);

		// Print the result
		if (isPalindrome) {
			System.out.println("The number " + number + " is a palindrome.");
		} else {
			System.out.println("The number " + number + " is not a palindrome.");
		}

		// Close the scanner to prevent resource leak
		scanner.close();
	}

	// Method to check if a number is a palindrome
	public static boolean checkPalindrome(int number) {
		int originalNumber = number;
		int reversedNumber = 0;

		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}

		return originalNumber == reversedNumber;
	}
}
