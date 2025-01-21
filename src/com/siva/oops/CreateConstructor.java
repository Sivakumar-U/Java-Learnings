package com.siva.oops;

public class CreateConstructor {

	public static void main(String[] args) {
		MyTest t1 = new MyTest();
		MyTest t2 = new MyTest();

	}

}

class MyTest {
	public MyTest() {
		System.out.println("Constructor");
	}
}
