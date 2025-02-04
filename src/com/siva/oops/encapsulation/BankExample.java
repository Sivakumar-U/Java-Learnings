package com.siva.oops.encapsulation;

public class BankExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(500);

		// Accessing balance through getter
		System.out.println("Current Balance: $" + account.getBalance());

		// Depositing money
		account.deposit(200);
		System.out.println("Updated Balance: $" + account.getBalance());

		// Withdrawing money
		account.withdraw(100);
		System.out.println("Updated Balance $" + account.getBalance());

		// Attempting invalid withdrawal
		account.withdraw(1000);

	}

}

class BankAccount {
	private double balance;

	// Constructor
	public BankAccount(double initialBalance) {
		if (initialBalance > 0) {
			balance = initialBalance;
		} else {
			balance = 0;
		}
	}

	// Getter method for balance
	public double getBalance() {
		return balance;
	}

	// Method to deposit money(modifies private variable)
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	// Method to withdraw amount(with validation)
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Invalid withdrawl amount");
		}

	}
}