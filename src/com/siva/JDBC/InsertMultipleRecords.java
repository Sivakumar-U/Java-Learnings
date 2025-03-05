package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultipleRecords {

	public static void main(String[] args) throws Exception {
		// Database connection details
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/studentdatabase";
		String user = "root";
		String pwd = "Sairam@2021";
		Connection con = null;
		Scanner sc = new Scanner(System.in);

		try {
			// Load JDBC driver
			Class.forName(driver);
			System.out.println("Driver is ready");

			// Establish connection
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection is ready");

			// SQL query for inserting records
			String query = "INSERT INTO account VALUES (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);

			// Loop for inserting multiple records
			while (true) {
				System.out.println("\nEnter Account details: ");

				System.out.print("Enter Account number: ");
				int num = sc.nextInt();
				sc.nextLine(); // Consume newline

				System.out.print("Enter Account name: ");
				String name = sc.nextLine();

				System.out.print("Enter balance: ");
				int balance = sc.nextInt();

				// Set values for placeholders
				ps.setInt(1, num);
				ps.setString(2, name);
				ps.setInt(3, balance);

				// Execute the query
				int count = ps.executeUpdate();
				System.out.println(count + " record inserted successfully.");

				// Ask if user wants to insert more records
				System.out.print("\nDo you want to insert another record? (yes/no): ");
				String choice = sc.next();
				if (choice.equalsIgnoreCase("no")) {
					break;
				}
			}

			System.out.println("\nAll records inserted successfully!");

		} finally {
			// Close connection
			if (con != null) {
				con.close();
				System.out.println("Connection closed");
			}
			sc.close(); // Close scanner
		}
	}
}
