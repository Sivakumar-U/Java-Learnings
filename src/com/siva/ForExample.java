package com.siva;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;

		System.out.println("Iterating i value by incrementing 1");
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}

		System.out.println("Iterating i value by incrementing 2");
		for (int i = 0; i <= n; i += 2) {
			System.out.println(i);
		}

	}

}
