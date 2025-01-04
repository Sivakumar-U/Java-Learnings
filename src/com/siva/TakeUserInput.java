package com.siva;

import java.util.Scanner;

public class TakeUserInput {

	public static void main(String[] args) {

		// System.in is nothing but the input stream from console
		// System.out is output stream into console
		Scanner myScanner = new Scanner(System.in);

		int x = 100;

		System.out.println("Current Value of x: " + x);

		System.out.println("Enter the new  value of x:");

		x = myScanner.nextInt();

		System.out.println("Updated Value of x: " + x);

		// using Ternary operator
		// System.out.println(x >= 500 ? "X is greater than 500" : "X is less than
		// 500");

		if (x >= 500) {
			System.out.println("X is greather than 500");
		} else {
			System.out.println("X is less than 500");
		}

		String name = "";

		System.out.println("Enter your name:");

		name = myScanner.next();

		System.out.println("Welcome " + name);

		myScanner.close();
	}

}
