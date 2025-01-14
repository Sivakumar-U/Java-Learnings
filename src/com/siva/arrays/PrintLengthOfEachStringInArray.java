package com.siva.arrays;

// Display length of each String in the Array.
public class PrintLengthOfEachStringInArray {

	public static void main(String[] args) {
		String[] arr = { "java", "Spring", "MySQL", "React" };
		for (String str : arr)
			System.out.println(str + " : " + str.length());

	}

}
