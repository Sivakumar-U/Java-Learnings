package com.siva.JDBC;

public class LoadDriver {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
			System.out.println("Driver is Ready");
		} catch (ClassNotFoundException e) {
			System.out.println("Exception: Driver is not found");
		}

	}

}
