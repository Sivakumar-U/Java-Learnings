package com.siva.StringManipulation_Programs;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Siva";
		String reversed = "";

		// Loop through the string from the end to the beginning
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i); // Add each character to the new reversed string
		}

		System.out.println("Reversed String: " + reversed);
	}
}
