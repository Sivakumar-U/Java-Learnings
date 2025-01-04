package com.fullstack.uncheckedexceptions;

/**
 * Java program to demonstrate IndexOutOfBound Exception
 */
public class IndexOutOfBoundExceptionExample {

	public static void main(String[] args) {

		int[] numbers = new int[10];

		try {
			numbers[0] = 10;
			numbers[1] = 11;
			numbers[2] = 12;
			numbers[11] = 13;// Here we given array size as 10 that means (0 to 9). but we are trying to access
								// 11th index so it gives exception as ArrayIndexBoundException.
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hello, ArrayIndexOutOfBound Exception occurs, cannot access invalid index");
		}

		catch (Exception e) {
			System.out.println("Parent Exception occurs" + e.getMessage());
		}

		System.out.println("End of the code");

	}

}
