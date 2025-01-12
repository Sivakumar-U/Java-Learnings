package com.siva.programs_Using_scanner;

import java.util.Scanner;

public class ReadEmpDetailsAndPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();

		System.out.println("Enter the name: ");
		String name = sc.next();

		System.out.println("Enter the salary: ");
		int salary = sc.nextInt();

		System.out.println("Employee Details: ID = " + id + " ,Name = " + name + " ,Salary = " + salary);
		
		sc.close();

	}

}
