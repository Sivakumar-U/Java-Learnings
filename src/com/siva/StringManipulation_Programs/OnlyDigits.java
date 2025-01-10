package com.siva.StringManipulation_Programs;

// Check if a String Contains Only Digits.
public class OnlyDigits {
	
	public static void main(String[] args) {
        String str = "12345";

        boolean isNumeric = true;
        for (char c : str.toCharArray()) {
            if (c < '0' || c > '9') { // Check if the character is outside the range of '0' to '9'
                isNumeric = false;
                break;
            }
        }

        System.out.println("Contains Only Digits? " + isNumeric);
    }

}
