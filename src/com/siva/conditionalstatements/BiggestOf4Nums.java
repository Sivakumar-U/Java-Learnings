package com.siva.conditionalstatements;

// check the biggest number from given 4 numbers.
public class BiggestOf4Nums {

	public static void main(String[] args) {
		int a = 10, b = 40, c = 30, d = 20;
		if (a > b && a > c && a > d)
			System.out.println("a is big");
		else if (b > c && b > d && b > a)
			System.out.println("b is big");
		else if (c > a && c > b && c > d)
			System.out.println("c is big");
		else
			System.out.println("d is big");
	}

}
