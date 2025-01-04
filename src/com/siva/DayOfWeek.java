package com.siva;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number representing the day of the week (1-7):");

		int dayNumber = scanner.nextInt();

		String dayOfWeek;
		
		switch (dayNumber) {
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
			break;
		case 7:
			dayOfWeek = "Saturday";
			break;
		default:
			dayOfWeek = "Invalid day number";
			break;
		}

		System.out.println("The day of the week corresponding to the number " + dayNumber + " is: " + dayOfWeek);

		scanner.close();
	}

}
