package com.siva.range_based_programs;

public class Factorial_UsingRange {

	public static void main(String[] args) {
		for (int n = 2; n <= 8; n++) {
			System.out.println("========== Factorial of: " + n + " ===========");
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
				System.out.println(fact);
			}
		}

	}

}
