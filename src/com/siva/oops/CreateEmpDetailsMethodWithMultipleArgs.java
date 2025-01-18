package com.siva.oops;

public class CreateEmpDetailsMethodWithMultipleArgs {

	public static void main(String[] args) {
		Employee.details(1, "Siva", 20000, 'M');
		Employee.details(2, "Mahesh", 23000, 'M');

	}

}

class Employee {
	public static void details(int id, String name, double salary, char gender) {
		System.out.println(id + " , " + name + " , " + salary + " , " + gender);

	}
}