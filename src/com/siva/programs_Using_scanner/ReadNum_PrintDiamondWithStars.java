package com.siva.programs_Using_scanner;

import java.util.Scanner;

public class ReadNum_PrintDiamondWithStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows: ");
		int rows = sc.nextInt();

		// for top half of the diamond
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" "); // for spaces
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*"); // for printing stars
			}
			System.out.println();// move to next line
		}

		// for bottom half of the diamond
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" "); // for spaces
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*"); // for printing stars
			}
			System.out.println();// move to next line
		}

	}

}
