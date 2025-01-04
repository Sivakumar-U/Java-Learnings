package com.fullstack.oops.encapsulation;

public class AccessingFieldsWithinSamePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiersExample example = new AccessModifiersExample();

		// System.out.println(example.privateField); not accessible for outside of the
		// class.

		System.out.println(example.defaultField);

		System.out.println(example.protectedField);

		System.out.println(example.publicField);

	}

}
