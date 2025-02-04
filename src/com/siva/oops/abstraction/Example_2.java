package com.siva.oops.abstraction;
/*
 * Here we have a abstract class with instance variable and abstract method.
 * and created child class(Second1) we implemented body for the abstract class.
 * finally created object using child class(second1) and provided values to instance variables.
 */
public class Example_2 {

	public static void main(String[] args) {
		Second1 s = new Second1(10, 20);
		s.details();

	}

}

abstract class First1 {
	public int a;

	public First1(int a) {
		this.a = a;
	}

	public abstract void details();
}

class Second1 extends First1 {
	public int b;

	public Second1(int a, int b) {
		super(a);
		this.b = b;
	}

	@Override
	public void details() {
		System.out.println("Details: " + super.a + " , " + this.b);

	}
}
