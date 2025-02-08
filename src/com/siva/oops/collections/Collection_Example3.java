package com.siva.oops.collections;

import java.util.ArrayList;

// Collection of Objects.
// Array is Fixed size.
// Collection is not Fixed size.
public class Collection_Example3 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Siva", "Hyd"));
		list.add(new Employee("sita", "USA"));
		list.add(new Employee("yuva", "Canada"));
		list.add(new Employee("jeeva", "Kakinada"));
		list.add(new Employee("yala", "India"));
		System.out.println("Employees are: ");
		for (Employee e : list) {
			System.out.println(e);
		}

	}

}

class Employees {
	private String name, location;

	public Employees(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String toString() {
		return this.name + " , " + this.location;

	}
}