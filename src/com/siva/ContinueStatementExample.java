package com.siva;

public class ContinueStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;
		// to check the number is odd number and use continue statement to skip all the
		// odd numbers
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				continue;
			}
			// to print all the even numbers
			System.out.println(i);
		}

		System.out.println("=============================================");
		// to check the number is even number and use continue statement to skip all the
		// even numbers
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				continue;
			}
			// to print all the odd numbers
			System.out.println(i);
		}

		System.out.println("=============================================");
		// to check the number is multiply with 5 and use continue statement to skip all
		// the those numbers
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0) {
				continue;
			}
			// to print all numbers which are not multiplied with 5
			System.out.println(i);
		}

	}

}
