package com.siva.oops;

public class CreatePersonClassAndCanVoteMethod {

	public static void main(String[] args) {
		Human.canVote("Siva", 28);
		Human.canVote("Harsha", 17);

	}

}

class Human {
	public static void canVote(String name, int age) {
		if (age >= 18)

			System.out.println(name + " can vote");
		else
			System.out.println(name + " cannot vote");

	}
}