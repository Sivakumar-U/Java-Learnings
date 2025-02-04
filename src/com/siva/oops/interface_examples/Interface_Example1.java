package com.siva.oops.interface_examples;

/*
 * Interface: It is a collection of abstract methods without having a body.
 * any class can implements interface.
 * By creating object of implemented class, we can access the functionality.
 */

public class Interface_Example1 {

	public static void main(String[] args) {
		Second s = new Second(); // here, we created object for implemented class(Second) to access the
									// functionality.
		s.m1();
		s.m2();
	}

}

interface First { // By default, interface has only abstract methods without having a abstract
					// keyword in the method.
	public void m1();

	public void m2();
}

class Second implements First { // In this class, we implemented the abstract methods which was defined in the
								// interface class.

	@Override
	public void m1() {
		System.out.println("m1...");

	}

	@Override
	public void m2() {
		System.out.println("m2...");

	}

}
