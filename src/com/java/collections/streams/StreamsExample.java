package com.java.collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student("Balu", 1, 20, 'B', 8.2));
		students.add(new Student("Ajay", 2, 23, 'C', 6.2));
		students.add(new Student("Chaitanya", 3, 22, 'A', 9.3));
		students.add(new Student("Deva", 4, 25, 'A', 7.9));
		students.add(new Student("Eswar", 5, 27, 'B', 8.4));

		// using forEach
		for (Student std : students) {

			System.out.println(std);
		}

		// To get names of students who got CGPA greater than or equal to 8.0 and in order of CGPA
		// lambda expression and functional interfaces

		List<String> names = students.stream()
				.filter(student -> student.getCgpa() >= 8.0)
				.sorted(new StudentCgpaComparator())
				.map(Student::getName)
				.collect(Collectors.toList());
		System.out.println(names);
	}

}
