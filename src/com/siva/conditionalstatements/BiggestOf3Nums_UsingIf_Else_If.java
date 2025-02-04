package com.siva.conditionalstatements;

// Check the Biggest of given 3 numbers.
public class BiggestOf3Nums_UsingIf_Else_If {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;
		if (a > b && a > c)
			System.out.println("a is big");
		else if (b > c)
			System.out.println("b is big");
		else
			
			System.out.println("c is big");
	}

}
