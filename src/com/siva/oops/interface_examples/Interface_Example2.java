package com.siva.oops.interface_examples;

public class Interface_Example2 {

	public static void main(String[] args) {
		Parent p;
		p = new Child1(); // Up-casting: It is the concept of assigning object address of child to parent
							// type reference variables.
		p.fun();
		p = new Child2();
		p.fun();

	}

}

interface Parent {
	public void fun();
}

class Child1 implements Parent {

	@Override
	public void fun() {
		System.out.println("child-1 functionality");
	}

}

class Child2 implements Parent {

	@Override
	public void fun() {
		System.out.println("child-2 functionality");

	}

}
