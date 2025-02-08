package com.siva.oops.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Here by using Example1 code modified with try-catch block to handle exception.
 */
public class Exception_Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try { // Try block is used to place doubtful code that raises exception.
			System.out.println("Enter 2 nums: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			System.out.println("Sum= " + c);
		} catch (InputMismatchException e) { // Catch block is used to collect exception object to handle that
												// exception.
			System.out.println("Exception: Invalid Input");
		}

	}

}
                     
// catch() block will not execute if no exception occurs in try-block.

/*
 * Output: 
 * -------- 
 * Enter 2 nums: 
 * acv 
 * Exception: Invalid Input
 */
