package com.siva.oops;

public class CreatePublicStaticVariable {

	public static void main(String[] args) {
		System.out.println("X Val: " + MyPublicStatic.x);

	}

}

class MyPublicStatic {
	public static int x = 30; // We can access public variables info from any class directly.
}
