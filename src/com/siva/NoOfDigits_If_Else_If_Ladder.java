package com.siva;

import java.util.Scanner;

public class NoOfDigits_If_Else_If_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int number = sc.nextInt();

		int count = 0;

		if (number < 9) {
			count = 1;
		} else if (number < 99) {
			count = 2;
		} else if (number < 999) {
			count = 3;
		} else if (number < 9999) {
			count = 4;
		} else if (number < 99999) {
			count = 5;
		} else if (number < 999999) {
			count = 6;
		} else if (number < 9999999) {
			count = 7;
		} else if (number < 99999999) {
			count = 8;
		} else if (number < 999999999) {
			count = 9;
		} else {
			count = 10;
		}

		System.out.println("The number of digits in " + number + " is " + count);
		
		sc.close();
	}

}
