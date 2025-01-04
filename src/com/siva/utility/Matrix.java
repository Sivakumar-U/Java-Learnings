package com.siva.utility;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows m: ");
		int m = sc.nextInt();
		System.out.println("Enter the columns n: ");
		int n = sc.nextInt();

		int[][] matrix = new int[m][n];
		int num = 1;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = num++;

			}
		}

		System.out.println("The matrix is:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(); // Move to the next line after printing each row
		}

		sc.close();

	}

}
