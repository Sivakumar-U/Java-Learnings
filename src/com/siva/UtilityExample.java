package com.siva;

import com.siva.utility.ArrayUtils;

public class UtilityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(ArrayUtils.searchIntegerArray(intArray, 10));

		double[] doubleArray = { 1.1, 2.3, 3.4, 4.5, 5.6 };
		System.out.println(ArrayUtils.searchDoubleArray(doubleArray, 2.3));

	}

}