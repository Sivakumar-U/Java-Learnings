package com.siva.oops;

// Creating Instance Method: With Arguments and No return values.
public class CheckEvenWithInstanceMethod {

	public static void main(String[] args) {
		CheckEvenOrNot c = new CheckEvenOrNot();
		c.isEven(12);

	}

}

class CheckEvenOrNot {
	public void isEven(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is Even Num");
		else
			System.out.println(num + " is not Even Num");
	}
}