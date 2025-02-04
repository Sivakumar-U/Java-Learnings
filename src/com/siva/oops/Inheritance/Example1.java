package com.siva.oops.Inheritance;

/*
 Here we have parent class with method m1 and child class with method m2. 
 we extend parent class to child class and created object for child class 
 then we call m1 and m2 method with child object reference.
 */
public class Example1 {

	public static void main(String[] args) {
		Child.m2();
		Child.m1();

	}

}

class Parent {
	public static void m1() {
		System.out.println("m1...");
	}
}

class Child extends Parent {
	public static void m2() {
		System.out.println("m2...");
	}
}
