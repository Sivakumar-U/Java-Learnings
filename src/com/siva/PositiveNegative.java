package com.siva;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {

		// Create Scanner object to get user input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number:");

		int number = scanner.nextInt();

		if (number > 0) {
			System.out.println("The number " + number + " is positive number.");
		} else if (number < 0) {
			System.out.println("The number " + number + " is negative number.");
		} else {
			System.out.println("The number is zero.");
		}

		scanner.close();
	}

}
