package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize ArrayList
		ArrayList<String> collections = new ArrayList<String>();

		// Adding elements into ArrayList using add method.
		collections.add("List");
		collections.add("Set");
		collections.add("Map");

		collections.add("LinkedList");
		collections.add("HashMap");
		collections.add("HashSet");

		System.out.println("Java Collections: " + collections);

		// Size of collections using size
		System.out.println("Collection size: " + collections.size());

		// Accessing elements using get method
		System.out.println("First Element is: " + collections.get(0));
		System.out.println("Second Element is: " + collections.get(1));

		// Adding first element to MyList
		collections.add(0, "MyList");
		System.out.println("Adding first element: " + collections);

		// changing first element from MyList to YourList
		collections.set(0, "YourList");
		System.out.println("Changing first Element: " + collections);

		// Remove element
		collections.remove(0);
		System.out.println("Removing First elemet: " + collections);

	}

}
