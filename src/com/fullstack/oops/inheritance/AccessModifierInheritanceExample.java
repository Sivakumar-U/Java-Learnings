package com.fullstack.oops.inheritance;

import com.fullstack.oops.encapsulation.AccessModifiersExample;

public class AccessModifierInheritanceExample extends AccessModifiersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifierInheritanceExample example = new AccessModifierInheritanceExample();

		// System.out.println(example.privateField); we cannot access private fields
		// outside of class

		// System.out.println(example.defaultField); we cannot access default fields
		// outside of the package

		System.out.println(example.protectedField);

		System.out.println(example.publicField);

	}

}
