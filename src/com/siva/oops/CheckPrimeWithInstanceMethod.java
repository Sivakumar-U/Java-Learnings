package com.siva.oops;

// Creating Instance Method: With Arguments and With String return values.
public class CheckPrimeWithInstanceMethod {

	public static void main(String[] args) {
		CheckPrimeOrNot cpn = new CheckPrimeOrNot();
		String res = cpn.isPrime(19);
		System.out.println(res);

	}

}

class CheckPrimeOrNot {
	public String isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			return num + " is Prime num";
		else
			return num + " is not prime num";
	}
}
