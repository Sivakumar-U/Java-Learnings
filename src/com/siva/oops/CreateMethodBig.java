package com.siva.oops;

public class CreateMethodBig {

	public static void main(String[] args) {
		Find.big(10, 50, 20);
		Find.big(30, 15, 23);

	}

}

class Find {
	public static void big(int a, int b, int c) {
		if (a > b && a > c)
			System.out.println("a is big");
		else if (b > c)
			System.out.println("b is big");
		else
			System.out.println("c is big");

	}
}
