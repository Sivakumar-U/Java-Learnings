package com.fullstack.oops.encapsulation;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle bike = new Vehicle("Red", 2);

		Vehicle car = new Vehicle("White", 4);

		Vehicle truck = new Vehicle("Black", 10);

		System.out.println("Bike color: " + bike.getColor());

		System.out.println("Car color: " + car.getColor());

		System.out.println("Truck color: " + truck.getColor());

		truck.setWheels(12);

		System.out.println("Truck wheels: " + truck.getWheels());

	}

}
