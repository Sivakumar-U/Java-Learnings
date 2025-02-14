package com.siva.oops.JDK8_features;

public class FunctionalInterface_With_Method3 {

	public static void main(String[] args) {
		Add1 a = (x, y) -> x + y;
		int res = a.nums(20, 30);
		System.out.println("Sum= " + res);

	}

}

@FunctionalInterface
interface Add1 {
	public int nums(int a, int b); // Method with Arguments and with Return Values in Interface.
}
