package com.fullstack.oops.inheritance;

public class Car extends Vehicles {

	private String type;

	private int doors;

	public Car(String color, int maxSpeed, int wheels, String type, int doors) {

		// super keyword is used for calling parent class constructor
		super("CAR", color, maxSpeed, wheels);
		this.type = type;
		this.doors = doors;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

}
