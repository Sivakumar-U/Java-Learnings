package com.siva.oops.encapsulation;

/*
 * Encapsulation: It is the process of hiding data inside a class and allowing access only through getter and setter methods.
 * It helps protect data from being changed directly and ensures security and control over data.
 */
public class Example1 {

	public static void main(String[] args) {

		// Creating an object
		Person person = new Person("John", 25);

		// Accessing private variables using getters and setters.
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());

		// Updating values using setters.
		person.setName("Alice");
		person.setAge(30);

		System.out.println("Updated Name: " + person.getName());
		System.out.println("Updated Age: " + person.getAge());

		// Trying to set an invalid age.
		person.setAge(-5);

	}

}

class Person {
	private String name; // Private variable (cannot be accessed directly)
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter method for name
	public String getName() {
		return name;
	}

	// Setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for age
	public int getAge() {
		return age;
	}

	// Setter method for age(with validation)
	public void setAge(int age) {
		if (age > 0) { // Only set age if it's a positive value.
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}

	}

}
