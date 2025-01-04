package com.siva.utility;

public class Circle {

	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double area() {
		return (Math.PI * this.radius * this.radius);
	}

	public double circumference() {
		return (2 * Math.PI * this.radius);
	}

}
