package com.fullstack.oops.abstraction;

public class ProgramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create instances of each concrete class
		Java java = new Java();
		C c = new C();
		Node node = new Node();

		// call the print method on each instance
		java.print();
		c.print();
		node.print();

	}

}
