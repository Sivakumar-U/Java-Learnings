package com.siva.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Program to print length of strings greater than 5 characters in list using filter().
 */
public class FilterExample_3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(
				Arrays.asList("Java", "HTML", "CSS", "JSP", "Hibernate", "Spring", "JavaScript"));
		Stream<String> stream = list.stream();

		List<String> greaterThan5 = stream.filter(s -> s.length() > 5).collect(Collectors.toList());
		greaterThan5.forEach(System.out::println);

	}

}
