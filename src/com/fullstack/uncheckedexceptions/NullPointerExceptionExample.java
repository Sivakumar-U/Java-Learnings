package com.fullstack.uncheckedexceptions;

class Vehicle {

	private String name;

	public Vehicle(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		Vehicle v = new Vehicle("MyVehicle");

		System.out.println(v.getName());

		Vehicle v1 = null;// here we given object as null so we can't call the method with null objects.
							// It throws NullPointerException

		try {
			System.out.println(v1.getName());
		} catch (NullPointerException ne) {
			System.out.println("Handled null pointer exception using catch block");
		}

		System.out.println("Program ended");

	}

}
