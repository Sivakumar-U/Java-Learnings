package com.siva.oops.collections;

// Array of Objects
public class Collection_Example2 {

	public static void main(String[] args) {
		Employee[] arr = new Employee[4];
		arr[0] = new Employee("Siva", "Hyd");
		arr[1] = new Employee("Raja", "Bglr");
		arr[2] = new Employee("Rama", "pune");
		arr[3] = new Employee("Lava", "Mumbai");
		System.out.println("Employees are: ");
		for (Employee e : arr) {
			System.out.println(e);
		}

	}

}

class Employee {
	private String name, location;

	public Employee(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String toString() {
		return this.name + " , " + this.location;

	}
}