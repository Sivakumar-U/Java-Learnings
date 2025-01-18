package com.siva.oops;

public class CreateMethod_isVowel {

	public static void main(String[] args) {
		Discover.isVowel('z');
		Discover.isVowel('I');
		Discover.isVowel('u');
		Discover.isVowel('B');

	}

}

class Discover {
	public static void isVowel(char ch) {
		char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
		boolean isPresent = false;
		for (char c : vowels) {
			if (c == ch) {
				isPresent = true;
				break;
			}

		}
		if (isPresent) {
			System.out.println(ch + " is Vowel");
		} else {
			System.out.println(ch + " is not Vowel");
		}

	}

}