package com.siva.loop_examples;

// Program to print prime numbers for the given range
public class PrimeNums_In_Given_Range {

	public static void main(String[] args) {
		for (int n = 1; n <= 20; n++) { // Given Range
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(n);

			}
		}

	}

}
