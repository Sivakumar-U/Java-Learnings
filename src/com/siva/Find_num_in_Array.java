package com.siva;

import java.util.Scanner;

public class Find_num_in_Array {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numbers = { 10, 20, 30, 40, 50 };

		System.out.print("Enter the number to search:");

		int searchNumber = scanner.nextInt();

		boolean found = false;

		// Search for the number in the array and print its index

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searchNumber) {
			}
			System.out.println("The number " + searchNumber + " is found at index " + i);
			found = true;
			break; // Stop searching once the number is found } }

			// If the number is not found, print a message 
			if (!found) {
			System.out.println("The number " + searchNumber + " is not found in the array.");
		}

		int i = 0;
		for (int num : numbers) {
			if (num == searchNumber) {
				found = true;
				break;
			}
			i++;
		}

		if (found) {
			System.out.println("The number " + searchNumber + " is found at index " + i);
		} else {
			System.out.println("The number " + searchNumber + " is not found in the array.");
		}

		scanner.close();
	}
}
