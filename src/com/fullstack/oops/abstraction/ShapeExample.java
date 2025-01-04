package com.fullstack.oops.abstraction;

public class ShapeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cannot instantiate abstract class
		// Shape shape = new Shape();

		Circle c = new Circle(7);

		Rectangle r = new Rectangle(10, 5);

		System.out.println(c + " Area: " + c.calculateArea());

		System.out.println(r + " Area: " + r.calculateArea());

	}

}
