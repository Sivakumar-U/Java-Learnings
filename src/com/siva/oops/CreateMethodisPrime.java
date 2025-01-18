package com.siva.oops;

public class CreateMethodisPrime {

	public static void main(String[] args) {
		Checks.isPrime(7);
		Checks.isPrime(12);

	}

}

class Checks {
	public static void isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println(num + " is Prime");
		else
			System.out.println(num + " is not prime");
	}
}
