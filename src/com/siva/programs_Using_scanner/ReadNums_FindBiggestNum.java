package com.siva.programs_Using_scanner;

import java.util.Scanner;

// Read four numbers and Find Biggest Number.
public class ReadNums_FindBiggestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if (a > b && a > c)
			System.out.println(a + " is big");
		else if (b > c && b > d)
			System.out.println(b + " is big");
		else if (c > d)
			System.out.println(c + " is big");
		else
			System.out.println(d + " is big");

	}

}
