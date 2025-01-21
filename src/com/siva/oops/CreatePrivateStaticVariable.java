package com.siva.oops;

public class CreatePrivateStaticVariable {

	public static void main(String[] args) {
		System.out.println("X val: " + MyPrivateStatic.x);// We cannot access private variables info
															// from other class directly.

	}

}

class MyPrivateStatic {
	private static int x = 20;

}
