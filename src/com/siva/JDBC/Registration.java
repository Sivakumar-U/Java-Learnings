package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Registration {

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

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter username: ");
			String username = sc.next();

			System.out.println("Enter Password: ");
			String password = sc.next();

			System.out.println("Confirm Password: ");
			String confirmPwd = sc.next();

			String query = "insert into register values(?,?)";
			PreparedStatement ps = con.prepareStatement(query);

			if (password.equals(confirmPwd)) {
				ps.setString(1, username);
				ps.setString(2, password);

				int count = ps.executeUpdate();
				if (count > 0)
					System.out.println("Registration Success");
				else
					System.out.println("Registration Failed");
			} else
				System.out.println("Password not matches with confirm passowrd");
			sc.close();
		} finally {
			if (con != null) {
				con.close();
				System.out.println("Connection closed..");
			}

		}

	}

}
