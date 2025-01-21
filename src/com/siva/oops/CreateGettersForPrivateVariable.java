package com.siva.oops;

public class CreateGettersForPrivateVariable {

	public static void main(String[] args) {
		// System.out.println("X val: "+MyGetter.x); Error
		System.out.println("X val: " + MyGetter.getX());

	}

}

class MyGetter {
	private static int x = 14;

	public static int getX() {
		return x;
	}
}
