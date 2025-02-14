package com.siva.oops.JDK8_features;

public class Functional_Interface {

	public static void main(String[] args) {
		Test3 t = () -> System.out.println("m1...");
		t.m1();

	}

}

@FunctionalInterface // we must define using @FunctionalInterface annotation.
interface Test3 {
	public void m1();
	// public void m2(); => Error: A functional interface has only one abstract methods.
}
