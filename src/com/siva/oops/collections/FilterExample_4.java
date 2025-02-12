package com.siva.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Program to print the strings in a stream which starts with given character using filter().
 */
public class FilterExample_4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(
				Arrays.asList("Java", "HTML", "CSS", "JSP", "Hibernate", "Spring", "JavaScript"));
		Stream<String> stream = list.stream();

		List<String> nameStartWith = stream.filter(s -> s.startsWith("J")).collect(Collectors.toList());
		nameStartWith.forEach(System.out::println);

	}

}
