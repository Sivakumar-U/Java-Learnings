package com.siva.utility;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating the new object from class(blueprint) person
		Person p1 = new Person("Siva", 28, 'M', "Software Engineer");
		Person p2 = new Person("Harsha", 22, 'M', "Engineer");
		Person p3 = new Person("Deepak", 24, 'M', "Business");

		p1.work();
		p2.work();
		p3.work();

	}

}
