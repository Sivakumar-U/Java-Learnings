package com.siva.oops;

public class CreateClassAndMethodWithArgs {

	public static void main(String[] args) {
		System.out.println("Main method");
		Add.nums(10, 20);
		Add.nums(22, 54);

	}

}

class Add {
	public static void nums(int a, int b) {
		int c = a + b;
		System.out.println("Sum: " + c);

	}
}