package com.siva.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Program to print 
 */
public class ReduceExample_2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(
				Arrays.asList("Java", "HTML", "CSS", "JSP", "Hibernate", "Spring", "JavaScript"));
		Stream<String> stream = list.stream();

		Optional<String> highestString = stream.reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
		System.out.println(highestString.get());

	}

}
