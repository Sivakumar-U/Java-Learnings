package com.fullstack.oops.inheritance;

public class Bike extends Vehicles {

	private String type;

	public Bike(String color, int maxSpeed, int wheels, String type) {

		// super keyword is used for calling parent class constructor
		super("BIKE", color, maxSpeed, wheels);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
