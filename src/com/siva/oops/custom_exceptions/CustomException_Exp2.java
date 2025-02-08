package com.siva.oops.custom_exceptions;

import java.util.Scanner;

public class CustomException_Exp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw amount: ");
		int amount = sc.nextInt();
		Account.withdraw(amount);

	}

}

class Account {
	public static int balance = 3000;

	public static void withdraw(int amount) {
		if (amount <= balance) {
			System.out.println("collect cash");
		} else {
			System.out.println("Error: Low balance");
		}
	}
}
