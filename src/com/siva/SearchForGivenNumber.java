package com.siva;

import java.util.Scanner;

public class SearchForGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 10, 20, 30, 40, 50 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to search: ");

		int x = sc.nextInt();

		//Initially assuming element is not found in array
		boolean found = false;

		for (int i : numbers) {
			if (i == x) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Given number is found in the array");

		} else {
			System.out.println("Number not found!");
		}
		sc.close();

	}

}
