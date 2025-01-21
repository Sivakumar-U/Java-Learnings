package com.siva.oops;

public class CreateEmpWithSetAndGetMethods {

	public static void main(String[] args) {
		Employee1.setCompanyName("Google");
		System.out.println("Company: " + Employee1.getCompanyName());

	}

}

class Employee1 {
	private static String companyName;// To access private variables we must create setters and getters methods.

	public static void setCompanyName(String companyName) { // setter method
		Employee1.companyName = companyName;

	}

	public static String getCompanyName() { // Getter method
		return companyName;

	}
}
