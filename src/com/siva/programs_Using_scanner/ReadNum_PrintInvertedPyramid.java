package com.siva.programs_Using_scanner;

import java.util.Scanner;

public class ReadNum_PrintInvertedPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int rows = sc.nextInt();
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
