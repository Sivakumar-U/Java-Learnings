package com.siva.oops.JDK8_features;

public class FunctionalInterface_With_Method2 {

	public static void main(String[] args) {
		Add add = (x, y) -> System.out.println(x + y);
		add.nums(10, 20);

	}

}

@FunctionalInterface
interface Add {
	public void nums(int a, int b); // Method with Arguments and No Return Values in Interface.
}
