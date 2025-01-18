package com.siva.oops;

public class CreateMethod_typeOfchar {

	public static void main(String[] args) {
		Finds.typeOfChar('A');
		Finds.typeOfChar('x');
		Finds.typeOfChar('6');
		Finds.typeOfChar('#');

	}

}

class Finds {
	public static void typeOfChar(char ch) {
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			System.out.println(ch + " is alphabet");
		else if (ch >= '0' && ch <= '9')
			System.out.println(ch + " is digit");
		else
			System.out.println(ch + " is symbol");

	}
}
