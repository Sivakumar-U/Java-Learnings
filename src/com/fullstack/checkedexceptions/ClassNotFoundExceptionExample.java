package com.fullstack.checkedexceptions;

// The Person class is a default class here.
// The normal class will be in the own class file name. So that it throwing exception as ClassNotFoundException below(Where Person class is not found here).
class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}
}

public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {

		try {
			Class personClass = Class.forName("com.fullstack.checkedexceptions.Person");// Here if we give Class Person
																						// with package name then it
																						// will not throw the
																						// ClassNotFound Exception here.
			System.out.println("Hurray!! I found the Person class");

		} catch (ClassNotFoundException e) {
			System.out.println(
					"There is ClassNotFoundException inside the code, Trying to access class which is not present");
			e.printStackTrace();
		}

	}

}
