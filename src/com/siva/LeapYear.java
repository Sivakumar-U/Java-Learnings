package com.siva;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a year:");

		int year = scanner.nextInt();

		boolean isLeapYear = false;

		// Leap year is divisible by 4 and not divisible by 100, except if it's also
		// divisible by 400
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeapYear = true;
		}

		if (isLeapYear) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

		scanner.close();
	}
}
