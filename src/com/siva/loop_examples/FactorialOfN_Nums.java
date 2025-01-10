package com.siva.loop_examples;

public class FactorialOfN_Nums {

	public static void main(String[] args) {
		int n = 5;
		int fact = 1;// here if we initiate the fact value as zero the multiplication with zero is always zero. 
					//so we initiate with 1.
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of N numbers: "+fact);
	}

}
