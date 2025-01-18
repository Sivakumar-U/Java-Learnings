package com.siva.oops;

public class CreateMethod_MultiplicationTable {

	public static void main(String[] args) {
		Print.multplicationTable(5);

	}

}

class Print {
	public static void multplicationTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}
}
