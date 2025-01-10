package com.siva.loop_examples;

public class PerfectNumBasedOnRange {

	public static void main(String[] args) {
		for (int n = 1; n <= 10000; n++) {

			int sum = 0;
			for (int i = 1; i < n - 1; i++) {
				if (n % i == 0)
					sum = sum + i;
			}
			if (n == sum) {
				System.out.println(n + " is a perfect number");
			}

		}

	}

}
