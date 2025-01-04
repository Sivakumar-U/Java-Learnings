package com.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> languages = new LinkedList<String>();

		// add elements
		languages.add("Python");
		languages.add("Java");
		languages.add("C");
		System.out.println("Linked List: " + languages);

		// Accessing first element
		String str1 = languages.peek();
		System.out.println("Accessing Element: " + str1);

		// Access and remove the first element
		String str2 = languages.poll();
		System.out.println("Removing Element: " + str2);
		System.out.println("Linked List after poll() : " + languages);

		// add element at the end
		languages.offer("Swift");
		System.out.println("Lnkedlist after offer() :" + languages);

	}

}
