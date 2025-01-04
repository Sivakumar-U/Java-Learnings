package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating an arrayList of even numbers
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(4);
		evenNumbers.add(6);
		System.out.println("ArrayListL: " + evenNumbers);

		// creating linkedHashSet from an ArrayList
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>(evenNumbers);
		System.out.println("LinkedHashSet: " + numbers);

		// calling the iterator() method
		Iterator<Integer> iterate = numbers.iterator();
		System.out.println("LinkedHashSet using Iterator: ");

		// Accessing Elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}

	}

}
