package com.siva.oops.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try { // Try block is used to place doubtful code that raises exception.
			System.out.println("Enter 2 nums: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Sum= " + c);
		} catch (InputMismatchException e1) { // Catch block is used to collect exception object to handle that
												// exception.
			System.out.println("Exception: Invalid Input");
		} catch (ArithmeticException e2) {
			System.out.println("Exception: Cannot divide with zero.");
		}

	}

}

/*
 * Note: try with multi catch blocks: one try block can have any number of catch blocks
 * ----- to handle different types of exceptions occurs in different lines of code.
 */

/*output:
Enter 2 nums: 
7
0
Exception: Cannot divide with zero.
*/