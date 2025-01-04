package com.siva.conditionalstatements;

// Check the Character is Alphabet or Not
public class LogicalOperatorUsingIf_Else_Example2 {

	public static void main(String[] args) {
		
		char ch = 'u';
		if(ch >= 'a' && ch <= 'z')
			System.out.println(ch+" is Alphabet");
		else
			System.out.println(ch+ " is Not Alphabet");

	}

}
