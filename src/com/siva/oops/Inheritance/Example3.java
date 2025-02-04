package com.siva.oops.Inheritance;

/*
 Here we just created constructor for each class(Parent and child) and created object for child class.
 */
public class Example3 {

	public static void main(String[] args) {
		Child2 c = new Child2();

	}

}

class Parent2 {
	public Parent2() {
		System.out.println("parent constructor");
	}
}

class Child2 extends Parent2 {
	public Child2() {
		System.out.println("Child constructor");
	}
}
