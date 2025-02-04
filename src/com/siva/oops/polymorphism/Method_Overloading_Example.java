package com.siva.oops.polymorphism;

/*
 * Polymorphism: we define object(class) that shows different functionality(methods) with same name.
 *  1) Static(Compile-time): It is a method overloading technique.
 *  2) Dynamic(Run-time): It is a method overriding technique. 
 */

/*
 * Method Overloading: Defining a multiple methods with same name but different parameters.
 * We can implement in single class.
 */
public class Method_Overloading_Example {

	public static void main(String[] args) {
		Add.nums(10, 20);
		Add.nums(10, 20, 30);
		Add.nums(10.2, 20.4);

	}

}

class Add {
	// Method with two integer parameters
	public static void nums(int a, int b) {
		System.out.println("Sum of 2 nums: " + (a + b));
	}

	// Overload Method with three integer parameters
	public static void nums(int a, int b, int c) {
		System.out.println("Sum of 3 nums: " + (a + b + c));
	}

	// Overload Method with two double parameters
	public static void nums(double a, double b) {
		System.out.println("Sum of 2 decimals: " + (a + b));
	}
}