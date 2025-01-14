package com.siva.arrays;

// using for loop we need to print character by character and also print reverse order  
public class PrintCharbyCharUsingForLoop {

	public static void main(String[] args) {
		String str = "siva";
		System.out.println("Display character by character:");
		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println("Display character in Reverse order:");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}

	}

}
