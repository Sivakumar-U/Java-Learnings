package com.java.collections.extended;

import java.util.ArrayList;
import java.util.Collections;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student("Balu", 1, 20, 'B', 8.2));
		students.add(new Student("Ajay", 2, 23, 'C', 6.2));
		students.add(new Student("Chaitanya", 3, 22, 'A', 9.3));

		// using forEach
		for (Student std : students) {

			System.out.println(std);
		}

		System.out.println("====================After Sorting====================");

		// Sort will use compareTo method of student to determine sorting order
		Collections.sort(students);

		// using forEach
		for (Student std : students) {

			System.out.println(std);
		}

		// sort using comparator
		Collections.sort(students, new StudentNameComparator());
		System.out.println("================= Sorting using comparator based on name ==============");
		// using forEach
		for (Student std : students) {

			System.out.println(std);
		}

		// sort using comparator
		Collections.sort(students, new StudentGradeComparator());
		System.out.println("================= Sorting using comparator based on grade ==============");
		// using forEach
		for (Student std : students) {

			System.out.println(std);
		}

		// sort using comparator
		Collections.sort(students, new StudentCgpaComparator());
		System.out.println("================= Sorting using comparator based on CGPA ==============");
		// using forEach
		for (Student std : students) {

			System.out.println(std);
		}

	}

}
