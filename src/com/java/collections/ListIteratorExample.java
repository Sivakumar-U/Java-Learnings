package com.java.collections;

import java.util.*;
//import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// using Iterator
		Iterator<Integer> itr = list.iterator();

		System.out.println("Iterator: ");
		System.out.println("Forward traversal: ");

		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();

		// using ListIterator

		ListIterator<Integer> i = list.listIterator();

		System.out.println("Iterator: ");
		System.out.println("Forward traversal: ");

		while (i.hasNext())
			System.out.print(i.next() + " ");
		System.out.println();

		System.out.println("Backward traversal: ");
		while (i.hasPrevious())
			System.out.print(i.previous() + " ");
		System.out.println();

	}

}
