package com.siva.oops;

public class GetPiValueWithInstanceMethod {

	public static void main(String[] args) {
		GetValue g = new GetValue();
		double res = g.PiValue();
		System.out.println("PI value is: " + res);

	}

}

class GetValue {
	public double PiValue() {
		return 3.142;
	}
}
