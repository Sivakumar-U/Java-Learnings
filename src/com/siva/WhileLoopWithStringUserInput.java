package com.siva;

import java.util.Scanner;

public class WhileLoopWithStringUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String st = "Yes";

		do {
			System.out.println("Enter \"quit\" to exit: ");

			st = sc.next();

		} while (!st.equals("quit"));
		System.out.println("Thanks for terminating the program");
		sc.close();

	}

}
