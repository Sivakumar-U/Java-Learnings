package com.siva;

import java.util.Scanner;

public class PositiveNegativeUsingTernary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int number = sc.nextInt();

		System.out.println(number >= 0 ? "Given number is positive" : "Given number is negative");

		sc.close();
	}

}
