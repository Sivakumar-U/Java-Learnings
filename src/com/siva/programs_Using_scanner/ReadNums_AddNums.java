package com.siva.programs_Using_scanner;

import java.util.Scanner;

// Read two numbers and add two numbers
public class ReadNums_AddNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Sum of two numbers: " + c);

	}

}
