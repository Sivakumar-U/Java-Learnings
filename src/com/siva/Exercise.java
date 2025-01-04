package com.siva;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] decimalArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		int middleIndex = decimalArray.length / 2;

		System.out.println("Middle Index in the array is: " + decimalArray[middleIndex]);

		// Add all the values in the array
		/*
		 * double sum = 0.0; for (double num : decimalArray) { sum += num; }
		 */

		double sum = decimalArray[0] + decimalArray[1] + decimalArray[2] + decimalArray[3] + decimalArray[4];

		// Print the sum of all the values
		System.out.println("The sum of all the values in the array is: " + sum);

	}

}
