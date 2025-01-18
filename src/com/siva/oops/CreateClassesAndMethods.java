package com.siva.oops;

public class CreateClassesAndMethods {

	public static void main(String[] args) {
		System.out.println("Main method");
		Second.fun();
		First.fun();
		Second.fun();

	}

}

class First {
	public static void fun() {
		System.out.println("First class fun");

	}

}

class Second {
	public static void fun() {
		System.out.println("Second class fun");

	}

}
