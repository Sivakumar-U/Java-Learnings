package com.siva;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static int romanToInt(String s) {

		// Create a map for Roman numeral values
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int total = 0;
		int prevValue = 0;

		// Loop through the characters in the string
		for (int i = s.length() - 1; i >= 0; i--) {
			char currentChar = s.charAt(i);
			int currentValue = romanMap.get(currentChar);

			// Check for subtraction rule
			if (currentValue < prevValue) {
				total -= currentValue;
			} else {
				total += currentValue;
			}

			prevValue = currentValue; // Update the previous value
		}

		return total;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take dynamic input from the user
		System.out.print("Enter a Roman numeral: ");
		String roman = scanner.nextLine();

		// Convert Roman numeral to integer and display the result
		int result = romanToInt(roman);
		System.out.println("The integer value of " + roman + " is: " + result);

		scanner.close();
	}

}
