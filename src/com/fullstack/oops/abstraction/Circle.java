package com.fullstack.oops.abstraction;

public class Circle extends Shape {

	private int radius;

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}

}
