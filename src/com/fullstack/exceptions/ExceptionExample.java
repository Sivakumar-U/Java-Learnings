package com.fullstack.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		}

		/*catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}*/

		catch (Exception e) {
			System.out.println("Parent Exception occurs"+e.getMessage());
		}

		System.out.println("End of the code");
	}

}
