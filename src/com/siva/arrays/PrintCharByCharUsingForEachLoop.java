package com.siva.arrays;

// Directly we cannot apply for-each loop on single string in Java.
public class PrintCharByCharUsingForEachLoop {

	public static void main(String[] args) {
		String str = "Siva";

		/*
		 * for(char ch :str) { System.out.println(ch); } // It gives error.It works in array of strings.
		 */

		char[] arr = str.toCharArray();// here we are converting String into char Array.
		for (char ch : arr)
			System.out.println(ch);

	}

}
