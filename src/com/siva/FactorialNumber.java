package com.siva;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number:");

		int number = scanner.nextInt();

		long factorial = 1; // Initialize factorial to 1

		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		System.out.println("The factorial of " + number + " is: " + factorial);

		scanner.close();
	}

}
