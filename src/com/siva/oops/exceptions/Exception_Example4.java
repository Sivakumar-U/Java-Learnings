package com.siva.oops.exceptions;

import java.util.Scanner;

/*
 * Exception: It is a parent class of all Exception classes.
 * We can handle any number of exceptions using single catch block.
 * we must specify catch(Exception e) to handle these.
 */
public class Exception_Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try { // Try block is used to place doubtful code that raises exception.
			System.out.println("Enter 2 nums: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Quotient= " + c);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage()); // It displays the pre-defined exception message.
		}

	}

}

/*
 * output: 
 * ------- 
 * Enter 2 nums: 
 * 2 
 * 0 
 * Exception: / by zero
 */
