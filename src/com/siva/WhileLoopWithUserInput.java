package com.siva;

import java.util.Scanner;

public class WhileLoopWithUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char ch = 'A';
		do {

			System.out.println("Enter N to exit the loop: ");

			ch = sc.next().charAt(0);

		} while (ch != 'N');
		System.out.println("Thanks for terminating the program");

		sc.close();

	}

}
