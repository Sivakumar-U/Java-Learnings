package com.siva.numbers;

/*
   Check if the number is divisible by any integer from 2 to √(number).
   If it is divisible by any of those numbers, it is not prime.
   Otherwise, it is prime.
 */
public class CheckPrimeOrNot {

	public static void main(String[] args) {
		int num = 25;
		boolean isPrime = true;
		for(int i=2; i<num; i++) 
		{
			if(num%i == 0) 
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) 
		{
			System.out.println(num + " is a prime number");
		}
		else 
		{
			System.out.println(num + " is not a prime number");
		}
				

	}

}
