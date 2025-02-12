package com.siva.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Program to print lenght of each string in a list using map().
 */
public class MapExample_4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(
				Arrays.asList("Java", "HTML", "CSS", "JSP", "Hibernate", "Spring", "JavaScript"));
		Stream<String> stream = list.stream();

		List<Integer> length = stream.map(s -> s.length()).collect(Collectors.toList());
		length.forEach(System.out::println);

	}

}
