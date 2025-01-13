package com.siva.programs_Using_scanner;

import java.util.Scanner;

public class ReadNum_PrintPyramidWithStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int rows = sc.nextInt(); // Number of rows
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" "); // Print spaces
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*"); // print stars
			}
			System.out.println();// move to next line
		}

	}

}
