package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClosingConnection {

	public static void main(String[] args) throws SQLException {
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
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			if (con != null) {
				con.close();
				System.out.println("Connection closed");
			}
		}

	}

}
