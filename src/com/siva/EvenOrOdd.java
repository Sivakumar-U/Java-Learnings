package com.siva;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("The number " + num + " is even");
		} else {
			System.out.println("The number " + num + " is odd");
		}
		sc.close();

	}

}
