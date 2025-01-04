package com.siva;

import java.util.Scanner;

public class SumOfNaturalNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of x: ");

		int x = sc.nextInt();
		int i = 1;
		int sumWhile = 0;
		int sumFor = 0;
		//using while loop
		while (i <= x) {
			sumWhile += i;
			i++;
		}
		System.out.println("Sum of first " + x + " numbers using while loop is " + sumWhile);

		//using for loop
		for (int j = 1; j <= x; j++) {
			sumFor += j;
		}
		System.out.println("Sum of first " + x + " numbers using for loop is " + sumFor);
		sc.close();

	}

}
