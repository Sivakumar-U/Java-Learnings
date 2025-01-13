package com.siva.programs_Using_scanner;

import java.util.Scanner;

public class ReadNum_PrintInvertedTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		for (int row = num; row >= 1; row--) {
			for (int col = 1; col <= row ; col++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
