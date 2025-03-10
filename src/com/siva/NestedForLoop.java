package com.siva;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				System.out.print("(" + i + "," + j + ")" + " ");
			}
			System.out.print("\n");
		}

		System.out.println("====================================================");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print("* ");
				} else {
					System.out.print(j + " ");

				}

			}
			System.out.print("\n");
		}

		System.out.println("====================================================");

		int rows = 5;

		// outer loop
		for (int i = 1; i <= rows; ++i) {

			// inner loop to print the numbers
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		System.out.println("====================================================");
		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("====================================================");
		for (int i = rows; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");

			}
			System.out.println();
		}

		System.out.println("====================================================");
		for (int i = rows; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
