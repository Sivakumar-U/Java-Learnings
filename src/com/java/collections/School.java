package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student("Siva", 90, "A"));
		students.add(new Student("Raja", 70, "C"));
		students.add(new Student("Chamu", 82, "B"));
		students.add(new Student("Dalu", 94, "A"));

		System.out.println("Original List: ");
		for (Student std : students) {
			System.out.println(std);
		}

		Collections.sort(students, new StudentGradeComparator());
		System.out.println("\nSorted by grades: ");
		for (Student std : students) {
			System.out.println(std);

		}

		Collections.sort(students, new StudentMarksComparator());
		System.out.println("\nSorted by Marks: ");
		for (Student std : students) {
			System.out.println(std);

		}

	}

}
