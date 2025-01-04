package com.siva.utility;

public class Person {

	// fields - determine current state of class - member variables / instance
	// variables.
	String name;
	int age;
	char gender;
	String occupation;

	// Constructor
	// - It's also a method.
	// - It doesn't have a return type
	// - used to create new instance of class
	// - used for instantiating state of object
	// - Java provide by default an empty constructor for all objects.

	public Person(String name, int age, char gender, String occupation) {
		// this keyword is used to refer to the current object.
		// used to access or modify the fields of the current object.
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}

	// methods
	public void work() {
		System.out.println("person " + name + " works as " + occupation);
	}

}
