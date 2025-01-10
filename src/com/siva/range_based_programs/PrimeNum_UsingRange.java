package com.siva.range_based_programs;

public class PrimeNum_UsingRange {

	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(n + " is a Prime number");
			} else {
				System.out.println(n + " is not a Prime number");
			}
		}

	}

}
