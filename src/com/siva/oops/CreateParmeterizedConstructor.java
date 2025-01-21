package com.siva.oops;

public class CreateParmeterizedConstructor {

	public static void main(String[] args) {
		MyClass mc1 = new MyClass(10, 20, 30);
		MyClass mc2 = new MyClass(100, 200, 300);
		mc1.details();
		mc2.details();

	}

}

class MyClass {
	private int a, b, c;

	public MyClass(int a, int b, int c) { // parameterized constructor and is used to set values
										 //to instance variables in object creation process.
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void details() {
		System.out.println(this.a + " , " + this.b + " , " + this.c);
	}
}
