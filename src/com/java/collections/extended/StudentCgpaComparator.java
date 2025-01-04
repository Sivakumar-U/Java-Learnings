package com.java.collections.extended;

import java.util.Comparator;

public class StudentCgpaComparator implements Comparator<Student> {

	// This method will return the values in ascending order based on CGPA
	@Override
	public int compare(Student o1, Student o2) {
		return (int) (o1.getCgpa() - o1.getCgpa());
	}

	/*
	 * This method will return the values in descending order based on CGPA
	 * 
	 * @Override 
	 * public int compare(Student o1, Student o2) { 
	 * return (int)(o2.getCgpa() - o1.getCgpa()); 
	 * }
	 */

}
