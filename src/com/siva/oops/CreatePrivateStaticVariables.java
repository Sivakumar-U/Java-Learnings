package com.siva.oops;

public class CreatePrivateStaticVariables {

	public static void main(String[] args) {
		MyStaticVar.setA(10);
		MyStaticVar.setB(20);
		System.out.println("a value: " + MyStaticVar.getA());
		System.out.println("b Value: " + MyStaticVar.getB());

	}

}

class MyStaticVar {
	private static int a, b; // If variable is static we define static getter and setter methods.

	public static void setA(int a) {
		MyStaticVar.a = a;
	}

	public static int getA() {
		return a;

	}

	public static void setB(int b) {
		MyStaticVar.b = b;
	}

	public static int getB() {
		return b;

	}
}
