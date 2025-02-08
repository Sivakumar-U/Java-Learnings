package com.siva.oops.custom_exceptions;

import java.util.Scanner;

public class CustomException_Exp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		Person.canVote(age);

	}

}

class Person {
	public static void canVote(int age) {
		if (age >= 18) {
			System.out.println("can Vote");
		} else {
			System.out.println("Error: Inavalid age");
		}
	}
}
