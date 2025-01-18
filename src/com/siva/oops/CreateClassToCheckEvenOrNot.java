package com.siva.oops;

public class CreateClassToCheckEvenOrNot {

	public static void main(String[] args) {
		Check.isEven(10);
		Check.isEven(3);
		Check.isEven(30);

	}

}

class Check {
	public static void isEven(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is Even");
		else
			System.out.println(num + " is Not Even");

	}
}
