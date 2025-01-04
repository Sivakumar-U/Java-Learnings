package com.fullstack.uncheckedexceptions;

/**
 * Java program to demonstrate Arithmetic Exception
 */
public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		try {
			int num = 30 / 0;
		}

		catch (ArithmeticException ae) {
			System.out.println("Hello, Arithmetic Exception occurs, cannot divide by zero");
		}

		catch (Exception e) {
			System.out.println("Parent Exception occurs" + e.getMessage());
		}

		System.out.println("End of the code");
	}

}
