package com.siva.oops;

// Creating Static Method: With Arguments and With String return values.
public class CheckPrimeWithStaticMethod {

	public static void main(String[] args) {
		String res = CheckPrime.isPrime(10);
		System.out.println(res);

	}

}

class CheckPrime {
	public static String isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}
		}
		if (count == 2)
			return num + " is Prime number";
		else
			return num + " is not Prime number";

	}
}
