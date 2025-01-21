package com.siva.oops;

public class CreatePrivateInstanceVariables {

	public static void main(String[] args) {
		MyInstancevar m = new MyInstancevar();
		m.setA(100);
		m.setB(200);
		System.out.println("a value: " + m.getA());
		System.out.println("b value: " + m.getB());

	}

}

class MyInstancevar {
	private int a, b;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;

	}

	public void setB(int b) {
		this.b = b;
	}

	public int getB() {
		return b;

	}
}
