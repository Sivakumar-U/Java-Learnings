package com.java.collections.extended;

public class Student implements Comparable<Student> {

	private String name;
	private int rollnumber;
	private int age;
	private char grade;
	private double cgpa;

	public Student(String name, int rollnumber, int age, char grade, double cgpa) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		this.age = age;
		this.grade = grade;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", age=" + age + ", grade=" + grade + ", cgpa="
				+ cgpa + "]";
	}

	// compareTo should return 0 when current object is equal to comparing object
	// compareTo should return -ve when current object is less than comparing object
	// compareTo should return +ve when current object is greater than comparing
	// object

	@Override
	public int compareTo(Student s) {
		// Its returns in ascending order based on age
		return this.age - s.age;
		// It returns in descending order based on age
		// return s.age - this.age;
	}

}
