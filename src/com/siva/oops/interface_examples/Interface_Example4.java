package com.siva.oops.interface_examples;

public class Interface_Example4 {

	public static void main(String[] args) {
		Vehicle v1 = new Car(); // Up-casting
		Vehicle v2 = new Bike();

		v1.start();
		v2.start();

	}

}

interface Vehicle {
	public void start();
}

class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car starts with a key");

	}

}

class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike starts with button");

	}

}
