package com.siva.range_based_programs;

// print Even numbers from 1 to 20 
public class EvenNumber_UsingRange {

	public static void main(String[] args) {
		for (int n = 1; n <= 20; n++) { // here we are using for loop to define range 1 to 20.
			if (n % 2 == 0) {
				System.out.println(n + " is Even number");
			}
		}

	}

}
