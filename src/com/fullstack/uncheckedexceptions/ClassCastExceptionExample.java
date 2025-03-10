package com.fullstack.uncheckedexceptions;

/**
 * Demonstrate ClassCastException
 */

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
}

class Doctor extends Person {

	private Boolean license;

	public Doctor(String name, Boolean license) {
		super(name);
		this.license = license;
	}
}

class Professor extends Person {

	private Integer experience;

	public Professor(String name, Integer experience) {
		super(name);
		this.experience = experience;
	}

}

public class ClassCastExceptionExample {

	public static void main(String[] args) {

		Person doctor = new Doctor("Doctor1", true);

		try {
			Professor professor = (Professor) doctor;// here we cannot cast one class to other class 
		} catch (ClassCastException ce) {
			System.out.println("Doctor type cannot be converted to Professor type");
			ce.printStackTrace();
			System.out.println(ce.getMessage());
		}
		System.out.println("Exception is handled");

	}

}
