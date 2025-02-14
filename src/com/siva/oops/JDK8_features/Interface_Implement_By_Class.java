package com.siva.oops.JDK8_features;

/*
 * Interface implemented by Class.
 */
public class Interface_Implement_By_Class {

	public static void main(String[] args) {
		Test t = new Demo();
		t.fun();

	}

}

interface Test {
	public void fun();
}

class Demo implements Test {

	@Override
	public void fun() {
		System.out.println("fun..");

	}

}