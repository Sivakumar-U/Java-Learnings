package com.java.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		// create integer type linked list
		LinkedList<Integer> numbers = new LinkedList<Integer>();

		// Add elements to linked list
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);

		System.out.println("Integer Linkedlist: " + numbers);

		// create String type linked list
		LinkedList<String> animals = new LinkedList<String>();

		// Add elements to linked list
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");

		System.out.println("String Linkedlist: " + animals);

		// get the element from the linked list
		String str = animals.get(1);
		System.out.println("Element at index 1: " + str);

		// change element at index 1
		animals.set(2, "Goat");
		System.out.println("Updated Linkedlist: " + animals);

		// using forEach loop
		System.out.println("Accessing elements using for each loop: ");
		for (String animal : animals) {
			System.out.print(animal);
			System.out.print(", ");
		}

		// using Collections Iterator
		Iterator<String> iterator = animals.iterator();
		System.out.println("\nAccessing Linked List elements: ");
		while (iterator.hasNext()) {
			String animal = iterator.next();
			System.out.print(animal);
			System.out.print(", ");
		}

		// using contains method
		System.out.println("\nDoes \"Cat\" contains in Linked List  : " + animals.contains("Cat"));

		// using contains method to find Integer value
		LinkedList<Integer> temp = new LinkedList<Integer>(List.of(1, 2, 3, 4, 5));
		System.out.println("Does temp contains \"5\": " + temp.contains(5));

		// using indexOf method
		System.out.println("Index of \"Dog\" : " + animals.indexOf("Dog"));
		System.out.println("Index of \"Cat\" : " + animals.indexOf("Cat"));
		System.out.println("Index of \"Cow\" : " + animals.indexOf("Cow"));
		System.out.println("Index of \"Goat\" : " + animals.indexOf("Goat"));

		// using remove method-> It removes first element
		System.out.println("Accessing Linked List elements: " + animals);
		animals.remove();
		System.out.println("Updated List: " + animals);
		
	}

}
