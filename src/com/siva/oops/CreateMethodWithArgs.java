package com.siva.oops;

public class CreateMethodWithArgs {

	public static void main(String[] args) {
		Person.canVote(13);
		Person.canVote(22);

	}

}

class Person {
	public static void canVote(int age) {
		if (age >= 18)
			System.out.println("can vote");
		else
			System.out.println("Cannot Vote");

	}
}
