package com.siva.oops.Inheritance;

public class Example4 {

	public static void main(String[] args) {
		Child3 c = new Child3(10, 20, 30, 40);
		c.details();

	}

}

class Parent3 {
	public int a, b;

	public Parent3(int a, int b) {
		this.a = a;
		this.b = b;
	}

}

class Child3 extends Parent3 {
	public int c, d;

	public Child3(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}

	public void details() {
		System.out.println("details: " + super.a + " , " + super.b + " , " + this.c + " , " + this.d);
	}
}
