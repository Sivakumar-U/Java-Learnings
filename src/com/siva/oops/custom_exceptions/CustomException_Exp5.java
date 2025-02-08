package com.siva.oops.custom_exceptions;

import java.util.Scanner;

public class CustomException_Exp5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			Persons.canVote(age);
		} catch (AgeException e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}

}

class Persons {
	public static void canVote(int age) throws AgeException {
		if (age >= 18) {
			System.out.println("can Vote");
		} else {
			AgeException obj = new AgeException("Invalid Age");
			throw obj;
		}
	}
}

class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}