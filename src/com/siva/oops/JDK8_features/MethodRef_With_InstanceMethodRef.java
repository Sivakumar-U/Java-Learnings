package com.siva.oops.JDK8_features;

public class MethodRef_With_InstanceMethodRef {

	public static void main(String[] args) {
		Text1 text = new Demo2()::xyz;
		text.abc();

	}

}

@FunctionalInterface
interface Text1 {
	public void abc();
}

class Demo2 {
	public void xyz() {
		System.out.println("xyz");
	}
}
