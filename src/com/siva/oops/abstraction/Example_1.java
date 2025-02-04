package com.siva.oops.abstraction;

/*
 * Here we created abstract class with one concrete method and abstract method without body. 
 * and we created another child class(Second) then we implemented body for abstract method.
 * finally, we create object for child class(second) and we access both m1 and m2 methods functionality. 
 */
public class Example_1 {

	public static void main(String[] args) {
		Second s = new Second();
		s.m1();
		s.m2();

	}

}

abstract class First {
	public void m1() {
		System.out.println("m1...");
	}

	public abstract void m2();

}

class Second extends First {

	@Override
	public void m2() {
		System.out.println("m2...");

	}

}