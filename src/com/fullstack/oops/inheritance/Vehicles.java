package com.fullstack.oops.inheritance;

public class Vehicles {

	// private field
	private String name;

	// private field
	private String color;

	// private field
	private int maxSpeed;

	// private field
	private int wheels;

	public Vehicles(String name, String color, int maxSpeed, int wheels) {
		super();
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.wheels = wheels;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicles [name=" + name + ", color=" + color + ", maxSpeed=" + maxSpeed + ", wheels=" + wheels + "]";
	}

}
