package com.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> mamals = new Vector<String>();

		// using add() Method
		mamals.add("Dog");
		mamals.add("Horse");

		// using index number
		mamals.add(2, "Cat");
		System.out.println("Vector: " + mamals);

		// using addAll() method
		Vector<String> animals = new Vector<String>();
		animals.add("Crocodile");

		animals.addAll(mamals);
		System.out.println("New Vector: " + animals);

		// using get()
		String element = animals.get(2);
		System.out.println("Element at index 2: " + element);

		// using iterator()
		Iterator<String> iterate = animals.iterator();
		System.out.println("Vector: ");
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}

	}

}
