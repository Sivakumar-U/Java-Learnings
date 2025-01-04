package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Siva", 25, "Male", "Senior Software Engineer"));
		persons.add(new Person("Hari", 27, "Male", "Quality Engineer"));
		persons.add(new Person("Pavan", 23, "Male", "Software Engineer"));
		persons.add(new Person("Bhargavi", 32, "Female", "Project Manager"));

		Collections.sort(persons);

		for (Person person : persons) {
			System.out.println(person);
		}

		List<Person> persons2 = persons.stream().filter(person -> {
			return person.getGender().equalsIgnoreCase("MALE");
		}).toList();

		for (Person person : persons2) {
			System.out.println(person);
		}

	}

}
