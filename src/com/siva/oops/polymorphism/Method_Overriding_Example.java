package com.siva.oops.polymorphism;
/*
 * Method Overriding: Defining a method in child class with same name of parent class method.
 * We need Inheritance to implement.
 */
public class Method_Overriding_Example {

	public static void main(String[] args) {
		Vehicle v1 = new Car();// up-casting
		Vehicle v2 = new Bike();

		v1.start();
		v2.start();

	}

}

class Vehicle {
	public void start() {
		System.out.println("Vehicle starting");
	}
}

class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car is starting with key");
	}
}

class Bike extends Vehicle {
	@Override
	public void start() {
		System.out.println("Bike is starting with switch");
	}
}
