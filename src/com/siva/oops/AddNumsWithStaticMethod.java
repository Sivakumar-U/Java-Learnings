package com.siva.oops;

// Creating Static Method: With Arguments and With return values.
public class AddNumsWithStaticMethod {

	public static void main(String[] args) {
		int res = AddNums.nums(10, 20);
		System.out.println("Sum of : " + res);

	}

}

class AddNums {
	public static int nums(int a, int b) {
		int c = a + b;
		return c;

	}
}
