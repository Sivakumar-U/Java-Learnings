package com.siva.conditionalstatements;

// Check the number is Two Digit or Not
public class LogicalOperatorUsingIf_Else {

	public static void main(String[] args) {
		
		int num = 365;
		if(num >= 10 && num <= 99)
			System.out.println(num + " is Two Digit Number");
		else
			System.out.println(num +" is Not Two Digit Number");

	}

}
