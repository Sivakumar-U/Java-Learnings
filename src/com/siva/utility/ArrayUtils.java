package com.siva.utility;

/**
 * ArrayUtils is a utility for having different search operations to be performed on arrays 
 */
public class ArrayUtils {

	/**
	 * This method is used for searching the given number in given input integer
	 * array returns the index of input integer in the array. returns -1 if input
	 * integer not found
	 * 
	 * @param inputArray
	 * @param searchKey
	 * @return
	 */
	public static int searchIntegerArray(int[] inputArray, int searchKey) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == searchKey) {
				return i;
			}
		}
		return -1;

	}

	/**
	 * This method is used for searching the given double number in given input double
	 * array returns the index of input double integer in the array. returns -1 if
	 * input double integer not found
	 * 
	 * @param inputArray
	 * @param searchKey
	 * @return
	 */
	public static int searchDoubleArray(double[] inputArray, double searchKey) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == searchKey) {
				return i;
			}
		}
		return -1;

	}

}
