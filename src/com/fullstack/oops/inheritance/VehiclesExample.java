package com.fullstack.oops.inheritance;

public class VehiclesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicles vehicles = new Vehicles("BUS", "Yellow", 30, 10);

		Bike bike = new Bike("Red", 100, 2, "Sports");

		Car car = new Car("White", 200, 4, "SUV", 4);

		// using toString method below values will print
		System.out.println(vehicles);

		System.out.println(bike);

		System.out.println(car);

		// change the bike color from Red to Blue
		System.out.println("Initial Bike color: " + bike);

		bike.setColor("Blue");

		System.out.println("Updated Bike color: " + bike);

		// change the car type from SUV to Sedan
		System.out.println("Initial Car type: " + car.getType());

		car.setType("Sedan");

		System.out.println("Updated Car type: " + car.getType());

	}

}
