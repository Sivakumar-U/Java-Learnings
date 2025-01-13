package com.siva.programs_Using_scanner;

import java.util.Scanner;

public class ReadNum_PrintSquareWithStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
