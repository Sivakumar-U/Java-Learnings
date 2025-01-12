package com.siva.programs_Using_scanner;

import java.util.Scanner;

public class ReadChar_CheckVowelOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character: ");
		char ch = sc.next().charAt(0);
		char[] characters = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
		boolean isPresent = false;
		for (char c : characters) {
			if (ch == c) {
				isPresent = true;
				break;
			}
		}
		if (isPresent)
			System.out.println(ch + " is Vowel");
		else
			System.out.println(ch + " is not Vowel");

	}

}
