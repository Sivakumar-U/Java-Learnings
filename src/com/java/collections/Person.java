package com.java.collections;

public class Person implements Comparable<Person> {

	private String name;

	private int age;

	private String gender;

	private String profession;

	public Person(String name, int age, String gender, String profession) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.profession = profession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public int compareTo(Person p) {

		// return Integer.compare(this.age, p.age);
		return this.age - p.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", profession=" + profession + "]";
	}

}
