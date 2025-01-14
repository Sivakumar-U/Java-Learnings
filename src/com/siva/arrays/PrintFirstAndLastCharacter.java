package com.siva.arrays;

public class PrintFirstAndLastCharacter {

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println("Length of String: " + str.length());

		System.out.println("First character: " + str.charAt(0));
		System.out.println("Last character: " + str.charAt(str.length() - 1));

	}

}
