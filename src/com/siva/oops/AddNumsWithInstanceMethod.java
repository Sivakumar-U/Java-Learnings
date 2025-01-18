package com.siva.oops;

// Creating Instance Method: With Arguments and with return values.
public class AddNumsWithInstanceMethod {

	public static void main(String[] args) {
		AddValues a = new AddValues();
		int res = a.nums(34, 23);
		System.out.println("Sum of Values: " + res);

	}

}

class AddValues {
	public int nums(int a, int b) {
		int c = a + b;
		return c;
	}
}
