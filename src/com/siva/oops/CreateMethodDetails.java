package com.siva.oops;

public class CreateMethodDetails {

	public static void main(String[] args) {
		Student.details("Siva", "Java", 10000, 'M');
		Student.details("Raja", "C#", 8000, 'M');
		Student.details("Hema", ".Net", 9000, 'F');

	}

}

class Student {
	public static void details(String name, String course, double fee, char gender) {
		System.out.println(name + " , " + course + " , " + fee + " , " + gender);

	}
}
