package com.siva.numbers;

/*
 Ex: 153 -> 1  5  3
 			1*1*1 + 5*5*5 + 3*3*3 
 			1 + 125 + 27 = 153
 		
 	 370 -> 3   7   0
 			3*3*3 + 7*7*7 + 0
 			27 + 343 = 370.
 */
public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int temp = num; // assigning num to temp variable.
		int reminder, sum = 0;

		while (num > 0) {
			reminder = num % 10; // It gives last digit(3) which is reminder.
			num = num / 10; // It removes last digit digit which is Quotient.
			sum = sum + reminder * reminder * reminder; // 0 + 3*3*3 = 27.
		}

		if (temp == sum)
			System.out.println(temp + " is an Armstrong number");
		else
			System.out.println(temp + " is not an Armstrong number");
	}

}
