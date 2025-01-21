package com.siva.oops;

public class CreateClassEmployee {

	public static void main(String[] args) {
		System.out.println("Company: " + MyEmployee.getCompanyName());

	}

}

class MyEmployee {
	private static String companyName = "L&T";

	public static String getCompanyName() {
		return companyName;
	}
}
