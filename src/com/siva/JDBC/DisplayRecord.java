package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DisplayRecord {

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

			Scanner sc = new Scanner(System.in); // Using scanner class we are going to set the values.
			System.out.println("Enter Account details: ");

			System.out.println("Enter Account number: ");
			int num = sc.nextInt();

			String query = "select * from account where num=?"; // Dynamic Query
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, num);
			ResultSet rs = ps.executeQuery(); // DRL query will return ResultSet which is boolean type true or false.
			if (rs.next())// next is boolean datatype, it checks if data is present or not. If present
							// true display details.
				System.out.println("Details: " + rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3));
			else
				System.out.println("Invalid Account num");

		} finally { // we can have finally block without catch block.
			if (con != null) {
				con.close();
				System.out.println("Connection closed");
			}

		}

	}

}
