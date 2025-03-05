package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/studentdatabase";
		String user = "root";
		String pwd = "Sairam@2021";
		try {
			Class.forName(driver);
			System.out.println("Driver is ready");

			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection is ready");

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}

}
