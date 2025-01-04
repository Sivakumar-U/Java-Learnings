package com.siva;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of terms in the Fibonacci series:");

		int numTerms = scanner.nextInt();

		System.out.println("Fibonacci series up to " + numTerms + " terms:");

		int num1 = 0, num2 = 1;
		for (int i = 1; i <= numTerms; ++i) {
			System.out.print(num1 + " ");

			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

		scanner.close();
	}
}
