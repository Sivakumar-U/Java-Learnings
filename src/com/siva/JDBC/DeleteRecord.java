package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {

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

			String query = "delete from account where num=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, num); // setting values based on index no of first place holder(?) and first column
								// name(num).
			int count = ps.executeUpdate();
			if (count > 0)
				System.out.println("Account deleted");
			else
				System.out.println("Invalid Account number");

		} finally { // we can have finally block without catch block.
			if (con != null) {
				con.close();
				System.out.println("Connection closed");
			}

		}
	}

}
