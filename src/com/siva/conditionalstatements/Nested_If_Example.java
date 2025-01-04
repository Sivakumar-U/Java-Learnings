package com.siva.conditionalstatements;

public class Nested_If_Example {

	public static void main(String[] args) {

		int num = 13;
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println(num + " is Even Num");
			} else {
				System.out.println(num + " is Not Even Num");
			}
		} else {
			System.out.println(num + " is not Positive Num");
		}

	}

}
