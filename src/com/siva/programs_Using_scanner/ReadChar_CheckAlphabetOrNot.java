package com.siva.programs_Using_scanner;

import java.util.Scanner;

// Read character and check Alphabet or not
public class ReadChar_CheckAlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			System.out.println(ch + " is a Alphabet");
		else
			System.out.println(ch + " is not Alphabet");

	}

}
