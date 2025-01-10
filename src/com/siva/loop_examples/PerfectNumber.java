package com.siva.loop_examples;

public class PerfectNumber {

	public static void main(String[] args) {
		int n = 6;
		int sum = 0;
		for (int i = 1; i < n - 1; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (n == sum) {
			System.out.println(n + " is a perfect number");
		} else {
			System.out.println(n + " is not a perfect number");
		}

	}

}
