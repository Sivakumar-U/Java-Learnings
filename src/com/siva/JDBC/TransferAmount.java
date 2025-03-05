package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TransferAmount {

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

			con.setAutoCommit(false); // Enable transaction

			Scanner sc = new Scanner(System.in);

			// Step 1: Enter Source and Destination Account Details
			System.out.print("Enter Source Account number: ");
			int src = sc.nextInt();

			System.out.print("Enter Destination Account number: ");
			int dest = sc.nextInt();

			System.out.print("Enter Amount to transfer: ");
			int amt = sc.nextInt();

			// Step 2: Check if Source Account Exists and Fetch Balance
			String query1 = "SELECT balance FROM account WHERE num = ?";
			PreparedStatement ps1 = con.prepareStatement(query1);
			ps1.setInt(1, src);
			ResultSet rs1 = ps1.executeQuery();

			if (!rs1.next()) {
				System.out.println("Error: Source account does not exist.");
				return;
			}
			int srcBalance = rs1.getInt(1);
			System.out.println("Current Source Account Balance: " + srcBalance);

			if (amt > srcBalance) {
				System.out.println("Error: Insufficient balance in source account.");
				return;
			}

			// Step 3: Check if Destination Account Exists
			String query2 = "SELECT balance FROM account WHERE num = ?";
			PreparedStatement ps2 = con.prepareStatement(query2);
			ps2.setInt(1, dest);
			ResultSet rs2 = ps2.executeQuery();

			if (!rs2.next()) {
				System.out.println("Error: Destination account does not exist.");
				return;
			}
			int destBalance = rs2.getInt(1);
			System.out.println("Current Destination Account Balance: " + destBalance);

			// Step 4: Withdraw from Source Account
			String withdrawQuery = "UPDATE account SET balance = balance - ? WHERE num = ?";
			PreparedStatement withdrawStmt = con.prepareStatement(withdrawQuery);
			withdrawStmt.setInt(1, amt);
			withdrawStmt.setInt(2, src);
			withdrawStmt.executeUpdate();

			// Step 5: Deposit to Destination Account
			String depositQuery = "UPDATE account SET balance = balance + ? WHERE num = ?";
			PreparedStatement depositStmt = con.prepareStatement(depositQuery);
			depositStmt.setInt(1, amt);
			depositStmt.setInt(2, dest);
			int count = depositStmt.executeUpdate();

			// Step 6: Check if Deposit was Successful
			if (count > 0) {
				con.commit();
				System.out.println("Amount transferred successfully.");
			} else {
				con.rollback();
				System.out.println("Transaction rollback: Destination Account Missing.");
			}

			// Step 7: Fetch and Display Updated Balances
			PreparedStatement ps3 = con.prepareStatement(query1);
			ps3.setInt(1, src);
			ResultSet rsUpdatedSrc = ps3.executeQuery();
			if (rsUpdatedSrc.next()) {
				System.out.println("Updated Source Account Balance: " + rsUpdatedSrc.getInt(1));
			}

			PreparedStatement ps4 = con.prepareStatement(query1);
			ps4.setInt(1, dest);
			ResultSet rsUpdatedDest = ps4.executeQuery();
			if (rsUpdatedDest.next()) {
				System.out.println("Updated Destination Account Balance: " + rsUpdatedDest.getInt(1));
			}

			// Close connections
			sc.close();
			con.close();
			System.out.println("Connection closed...");

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			if (con != null) {
				con.rollback();
				System.out.println("Transaction rollback due to an error.");
			}
		}
	}
}
