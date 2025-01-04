package com.siva;

import java.util.Scanner;

public class Print_Even_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of N:");

		int N = scanner.nextInt();

		System.out.println("Even numbers between 1 and " + N + ":");
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		scanner.close();
	}

}
