package com.siva.oops.collections;

import java.util.ArrayList;

public class Collection_Example4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("After adding elements: " + list);

		list.add(1, 40);
		System.out.println("After adding element1: " + list);

		// int getElement = list.get(2);
		System.out.println("After adding element3: " + list.get(3));

		list.set(2, 24);
		System.out.println("After replacing element2: " + list);

		list.remove(2);
		System.out.println("After removing element2: " + list);

		list.clear();
		System.out.println("After clearing all elements: " + list);

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		System.out.println("Added elements: " + list);
		System.out.println("Index of 200: " + list.indexOf(200));

		// list.add(500);
		System.out.println("Last element Index of: " + list.lastIndexOf(400));

		System.out.println("Is the list empty: " + list.isEmpty());

		System.out.println("Size of the list: " + list.size());
	}
}
