package com.java.collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> animals = new LinkedList<String>();

		// add Element at the beginning
		animals.add("Cow");
		System.out.println("LinkedList: " + animals);

		// add element at the first
		animals.addFirst("Dog");
		System.out.println("LinkedList after addFirst(): " + animals);

		// add element at the last
		animals.addLast("Zebra");
		System.out.println("LinkedList after addLast(): " + animals);

		// remove the first element
		animals.removeFirst();
		System.out.println("LinkedList after removeFirst(): " + animals);

		// remove the last element
		animals.removeLast();
		System.out.println("LinkedList after removeLast(): " + animals);

	}

}
