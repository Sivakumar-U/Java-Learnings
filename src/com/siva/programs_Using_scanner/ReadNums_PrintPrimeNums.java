package com.siva.programs_Using_scanner;

import java.util.Scanner;

public class ReadNums_PrintPrimeNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int n = a; n <= b; n++) {
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}

			}
			if (count == 2)
				System.out.println(n + " is prime number");
			else
				System.out.println(n + " is not prime number");
		}

	}

}
