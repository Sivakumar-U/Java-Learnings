package com.siva.programs_Using_scanner;

import java.util.Scanner;

// Read age and print can vote or Not.
public class ReadAge_PrintVoteOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if (num >= 18)
			System.out.println("Can Vote");
		else
			System.out.println("Cannot Vote");

	}

}
