package com.siva;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable Declaration Statements
		int num1 = 10, num2 = 25;

		System.out.println("= Output: " + num2);
		// num2 = num2 + num1
		num2 += num1;
		System.out.println("+= Output: " + num2);
		// num2 = num2 - num1
		num2 -= num1;
		System.out.println("-= Output: " + num2);

		// num2 = num2 * num1
		num2 *= num1;
		System.out.println("*= Output: " + num2);

		// num2 = num2 / num1
		num2 /= num1;
		System.out.println("/= Output: " + num2);
		// num2 = num2 % num1
		num2 %= num1;
		System.out.println("%= Output: " + num2);

		boolean completed = false;

		System.out.println(completed);
		System.out.println(!completed);
		System.out.println(completed);
		completed = !completed;
		System.out.println(completed);

	}

}
