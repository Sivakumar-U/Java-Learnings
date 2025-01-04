package com.siva.utility;

public class CircleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(15);

		System.out.println("Area of circle 1: " + c1.area());
		System.out.println("Area of circle 2: " + c2.area());
		System.out.println("Area of circle 3: " + c3.area());

		System.out.println("Circumference of circle 1: " + c1.circumference());
		System.out.println("Circumference of circle 2: " + c2.circumference());
		System.out.println("Circumference of circle 3: " + c3.circumference());

	}

}
