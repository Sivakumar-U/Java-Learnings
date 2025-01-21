package com.siva.oops;

public class CreateStdWithSetAndGetMethods {

	public static void main(String[] args) {
		Student1.setCourseName("Java");
		System.out.println("Course: " + Student1.getCourseName());

	}

}

class Student1 {
	private static String courseName;

	public static void setCourseName(String courseName) {
		Student1.courseName = courseName;
	}

	public static String getCourseName() {
		return courseName;

	}
}
