package com.siva.oops.Inheritance;

/*
 * Here we have parent class and child class with each one instance variable and constructor. 
 * we are passing value to parent class variable through super() method. 
 *  then created a object for child class and accessing details methods using object reference.
 */
public class Example2 {

	public static void main(String[] args) {
		Child1 c = new Child1(10, 20);
		c.details();

	}

}

class Parent1 {
	public int a;

	public Parent1(int a) {
		this.a = a;
	}

}

class Child1 extends Parent1 {
	public int b;

	public Child1(int a, int b) {
		super(a);
		this.b = b;
	}

	public void details() {
		System.out.println("Details: " + super.a + " , " + this.b);
	}

}
