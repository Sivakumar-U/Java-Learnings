package com.fullstack.oops.encapsulation;

public class AccessModifiersExample {

	// Private Access Modifier - only accessible within the class
	private String privateField = "This is private field";

	// Default Access Modifier - only accessible within the same package
	String defaultField = "This is default field";

	// Protected Access Modifier - Accessible to within the same package and
	// also accessible to the child class.
	protected String protectedField = "This is protected field";

	// Public Access Modifier - accessible to child class
	public String publicField = "This is public field";

	public static void main(String[] args) {

		AccessModifiersExample example = new AccessModifiersExample();

		System.out.println(example.privateField);

		System.out.println(example.defaultField);

		System.out.println(example.protectedField);

		System.out.println(example.publicField);

	}

}
