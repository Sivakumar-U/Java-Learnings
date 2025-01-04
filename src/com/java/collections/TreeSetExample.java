package com.java.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> evenNumbers = new TreeSet<Integer>();

		// using Add() method-> It will sorted the values
		evenNumbers.add(8);
		evenNumbers.add(6);
		evenNumbers.add(4);
		evenNumbers.add(2);
		System.out.println("TreeSet: " + evenNumbers);

		TreeSet<Integer> number = new TreeSet<Integer>();
		number.add(1);
		System.out.println("New TreeSet: " + number);

		// Using AddAll() method
		number.addAll(evenNumbers);
		System.out.println("New TreeSet: " + number);

		Iterator<Integer> normalIterator = number.iterator();
		while (normalIterator.hasNext()) {
			Integer numbers = normalIterator.next();
			System.out.print(numbers);
			System.out.print(", ");
		}

		// Iterating the values using descendingIterator() method 
		Iterator<Integer> specialIterator = number.descendingIterator();
		while (specialIterator.hasNext()) {
			Integer numbers = specialIterator.next();
			System.out.print(numbers);
			System.out.print(", ");
		}

	}

}
