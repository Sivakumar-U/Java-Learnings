package com.siva.oops;

// Creating Static Method: With Arguments and No return values.
public class CheckEvenWithStaticMethod {

	public static void main(String[] args) {
		CheckEven.isEven(13);
		CheckEven.isEven(12);

	}

}

class CheckEven {
	public static void isEven(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is Even Num");
		else
			System.out.println(num + " is Not Even Num");
	}
}
