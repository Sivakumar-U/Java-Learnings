package com.siva.oops.JDK8_features;

/*
 * Method Reference: It is the concept of assigning existing method logic to Functional Interface.
 */
public class MethodRef_With_StaticMethodRef {
	public static void main(String[] args) {
		Text t = Demo1::xyz; // Static Method Reference
		t.abc();

	}

}

@FunctionalInterface
interface Text {
	public void abc();
}

class Demo1 {
	public static void xyz() {
		System.out.println("xyz...");
	}
}