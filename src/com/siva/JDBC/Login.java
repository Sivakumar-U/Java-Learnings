package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login {

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
			System.out.print("\nEnter username: ");
			String username = sc.next();

			System.out.print("Enter Password: ");
			String password = sc.next();

			String query = "select password from register where username=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// if user found it will get the password using above query.
				String pass = rs.getString(1);
				if (password.equals(pass))
					System.out.println("Login Success");
				else
					System.out.println("Error: Wrong Password");
			} else
				System.out.println("Error: User not found");
		} finally {
			if (con != null) {
				con.close();
				System.out.println("Connection closed");
			}
		}

	}

}
