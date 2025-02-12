package com.siva.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Program to print string values in list to a upper case using map(). 
 */
public class MapExample_3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("java", "stream", "map"));
		Stream<String> stream = list.stream();

		List<String> upperCase = stream.map(String::toUpperCase).collect(Collectors.toList());
		upperCase.forEach(System.out::println);

	}

}
