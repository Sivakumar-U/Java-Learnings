package com.siva.range_based_programs;

// Print multiplication tables from 5 to 10 numbers.
public class Tables_UsingRange {

	public static void main(String[] args) {
		for (int n = 5; n <= 10; n++) { // here we given range from 5 to 10 to print the tables.
			System.out.println("========== Multiplication Table : " + n + " ===========");
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " * " + i + " = " + (n * i));
			}
		}

	}

}
