package com.siva.loop_examples;

public class SumOfN_Numbers {

	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of N numbers: "+sum);

	}

}
