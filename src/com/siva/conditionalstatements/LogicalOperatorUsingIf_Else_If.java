package com.siva.conditionalstatements;

// Check the Character is Upper/ Lower/ Digit/ Symbol
public class LogicalOperatorUsingIf_Else_If {

	public static void main(String[] args) {
		
		char ch = '#';
		if(ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is a Uppercase Alphabet");
		else if(ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is a LowerCase  Alphabet");
		else if(ch >= '0' && ch <= '9')
			System.out.println(ch + " is a Digit");
		else
			System.out.println(ch + " is a Symbol");

	}

}
