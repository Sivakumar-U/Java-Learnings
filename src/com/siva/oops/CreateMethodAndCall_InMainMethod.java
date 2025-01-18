package com.siva.oops;

public class CreateMethodAndCall_InMainMethod {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Test.fun();
		Test.fun();

	}

}

class Test {
	public static void fun() {
		System.out.println("fun Method");
	}
}