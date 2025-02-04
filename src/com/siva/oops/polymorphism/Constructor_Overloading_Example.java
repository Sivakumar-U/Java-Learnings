package com.siva.oops.polymorphism;

/*
 * Can we Overload Constructor?
 * Yes, We can overload constructor also. as shown in the below class Circle.
 */
public class Constructor_Overloading_Example {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle("Red");
		Circle c3 = new Circle("Blue", 12);

	}

}

class Circle {
	public Circle() {
		System.out.println("Default circle drawn");
	}

	public Circle(String color) {
		System.out.println("Circle drawn with " + color + " color");
	}

	public Circle(String color, int radius) {
		System.out.println("Circle drawn with " + color + " color and radius " + radius);
	}
}
