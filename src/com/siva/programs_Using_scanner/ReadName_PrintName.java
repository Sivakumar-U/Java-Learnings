package com.siva.programs_Using_scanner;

// Read name and print name
import java.util.Scanner;

public class ReadName_PrintName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Hello " + name);

	}

}
