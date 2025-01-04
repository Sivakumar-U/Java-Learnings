package com.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {

		System.out.println("=======================Using HashMap===========================");
		// Using HashMap (does not preserve insertion order)
		HashMap<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("us", "United Stated");
		countryMap.put("br", "Brazil");
		countryMap.put("es", "Spain");
		countryMap.put("in", "India");

		// using forEach loop using Key set
		for (String key : countryMap.keySet()) {
			System.out.println(key + " - " + countryMap.get(key));
		}

		// using forEach loop using Entry set
		for (Entry<String, String> entry : countryMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println("======================Using LinkedHashMap===========================");

		// Using LinkedHashMap (preserves insertion order)
		LinkedHashMap<String, String> countryMap1 = new LinkedHashMap<String, String>();
		countryMap1.put("us", "United Stated");
		countryMap1.put("br", "Brazil");
		countryMap1.put("es", "Spain");
		countryMap1.put("in", "India");

		// using forEach loop using Key set
		for (String key : countryMap1.keySet()) {
			// It will print both key and value
			System.out.println(key + " - " + countryMap.get(key));

			// It will print only key
			System.out.println(key);
		}

		// using forEach loop using Entry set
		for (Entry<String, String> entry : countryMap1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println("=======================Using TreeMap<String, String>===========================");

		// Using TreeMap it will sort based on keys
		TreeMap<String, String> countryMap2 = new TreeMap<String, String>();
		countryMap2.put("us", "United Stated");
		countryMap2.put("br", "Brazil");
		countryMap2.put("es", "Spain");
		countryMap2.put("in", "India");

		// using forEach loop using Key set
		for (String key : countryMap2.keySet()) {
			// It will print both key and value
			System.out.println(key + " - " + countryMap2.get(key));

			// It will print only key
			System.out.println(key);
		}

		// using forEach loop using Entry set
		for (Entry<String, String> entry : countryMap2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println("=======================Using TreeMap<Integer, String>===========================");
		// Using TreeMap it will sort based on keys
		TreeMap<Integer, String> numbers = new TreeMap<Integer, String>();
		numbers.put(5, "Five");
		numbers.put(1, "One");
		numbers.put(3, "Three");
		numbers.put(4, "Four");
		numbers.put(2, "Two");

		// using forEach loop using Key set
		for (Integer key : numbers.keySet()) {
			// It will print both keys and values
			System.out.println(key + " - " + numbers.get(key));

			// It will print only keys
			// System.out.println(key);
		}

		// using forEach loop using Entry set
		for (Entry<Integer, String> entry : numbers.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

}
