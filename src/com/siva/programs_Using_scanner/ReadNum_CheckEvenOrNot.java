package com.siva.programs_Using_scanner;

import java.util.Scanner;

// Read number and check number is Even or not.
public class ReadNum_CheckEvenOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if (n % 2 == 0)
			System.out.println(n + " is Even number");
		else
			System.out.println(n + " is Not Even number");

	}

}
