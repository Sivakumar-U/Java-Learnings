package com.siva.oops.custom_exceptions;

import java.util.Scanner;

public class CustomException_Exp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw amount: ");
		int amount = sc.nextInt();
		try {
			Account1.withdraw(amount);
		} catch (LowBalanceException e) {
			System.out.println("Exception: Low Balance");
		}

	}

}

class Account1 {
	public static int balance = 3000;

	public static void withdraw(int amount) throws LowBalanceException {
		if (amount <= balance) {
			System.out.println("collect cash");
		} else {
			LowBalanceException obj = new LowBalanceException();
			throw obj;
		}
	}
}

class LowBalanceException extends Exception {
	// empty
}
