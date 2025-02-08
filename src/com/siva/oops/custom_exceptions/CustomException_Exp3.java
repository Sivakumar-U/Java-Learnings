package com.siva.oops.custom_exceptions;

import java.util.Scanner;

public class CustomException_Exp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			Person1.canVote(age); // 4) We must handle that exception while calling the method.
		} catch (InvalidAgeException e) {
			System.out.println("Exception: Invalid Age");
		}

	}

}

class Person1 {
	public static void canVote(int age) throws InvalidAgeException { // 3) throws is used to specify which exception
																		// occurs inside the method.
		if (age >= 18) {
			System.out.println("can Vote");
		} else {
			InvalidAgeException obj = new InvalidAgeException();
			throw obj; // 2) throw that exception object in failure case.
		}
	}
}

class InvalidAgeException extends Exception { // 1) Define custom exception by extending pre-defined Exception class.

}
