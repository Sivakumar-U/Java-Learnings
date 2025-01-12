package com.siva.programs_Using_scanner;

import java.util.Scanner;

// Read character and check Symbol(!@#$&*%) or not.
public class ReadChar_CheckSymbolOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
			System.out.println(ch + " is a Symbol");
		else
			System.out.println(ch + " is Not Symbol");

	}

}
