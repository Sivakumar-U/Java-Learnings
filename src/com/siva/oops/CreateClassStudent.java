package com.siva.oops;

public class CreateClassStudent {

	public static void main(String[] args) {
		System.out.println("Course: " + MyStudent.getCourseName());

	}

}

class MyStudent {
	private static String courseName = ".Net";

	public static String getCourseName() {
		return courseName;
	}
}