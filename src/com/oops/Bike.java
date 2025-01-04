package com.oops;

/**
 * This is a child class of vehicle. This has all inherited properties of vehicle
 * Encapsulated child class
 */

public class Bike extends Vehicle {

	private BikeType type;

	public Bike(String model, String color, BikeType type) {
		super("BIKE", model, color, 2);
		this.type = type;
	}

	public BikeType getType() {
		return type;
	}

	public void setType(BikeType type) {
		this.type = type;
	}

}
