package com.siva.oops;

// Creating Static Method: No Arguments and with integer return value.
public class GetPiValueWithStaticMethod {

	public static void main(String[] args) {
		double res = Get.piValue();
		System.out.println("PI value is: " + res);

	}

}

class Get {
	public static double piValue() {
		return 3.142;
	}
}
