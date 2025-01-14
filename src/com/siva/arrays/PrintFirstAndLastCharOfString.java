package com.siva.arrays;

// Display first and last character of each string in the array.
public class PrintFirstAndLastCharOfString {

	public static void main(String[] args) {
		String[] arr = { "Siva", "Ramana", "Swetha", "Yuvan", "Likhith" };
		for (String str : arr)
			System.out.println(str + " : First character= " + str.charAt(0) + " , Last character= " + str.charAt(str.length() - 1));

	}

}
