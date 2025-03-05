package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAllRecords {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/studentdatabase";
		String user = "root";
		String pwd = "Sairam@2021";
		Connection con = null;

		try {
			Class.forName(driver);
			System.out.println("Driver is ready");

			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection is ready");

			String query = "select * from account"; // Static Query so we use statement class below.
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(query); // DRL query will return ResultSet which is boolean type true or
														// false.
			while (rs.next())// we use while loop when we don't know exact no of records present in table.
				System.out.println("Details: " + rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3));

		} finally { // we can have finally block without catch block.
			if (con != null) {
				con.close();
				System.out.println("Connection closed");
			}

		}

	}

}
