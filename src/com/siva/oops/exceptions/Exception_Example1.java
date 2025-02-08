package com.siva.oops.exceptions;

/*
 * Exception: It is Runtime error.
 * It terminates normal flow of execution.
 * Exception is a class.
 */
import java.util.Scanner;

public class Exception_Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 nums: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Sum= " + c);

	}

}

/*
 * output:
 * ------ 
 * Enter 2 nums: (Here I entered wrong input which is string) to handle this error we use exceptions.
 *  abc
 * Exception in thread "main" java.util.InputMismatchException
 */
