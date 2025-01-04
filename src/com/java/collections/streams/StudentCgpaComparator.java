package com.java.collections.streams;

import java.util.Comparator;

public class StudentCgpaComparator implements Comparator<Student> {

	// This method will return the values in ascending order based on CGPA
	@Override
	public int compare(Student o1, Student o2) {
		return Double.valueOf(o1.getCgpa()).compareTo(Double.valueOf(o2.getCgpa()));
	}

	/*
	 * This method will return the values in descending order based on CGPA
	 * 
	 * @Override
		public int compare(Student o1, Student o2) {
		return Double.valueOf(o2.getCgpa()).compareTo(Double.valueOf(o1.getCgpa()));
	}
	 */

}
