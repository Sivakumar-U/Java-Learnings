package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class WithdrawAmount {

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
            System.out.println("Enter Account details: ");

            // Step 1: Enter account number
            System.out.print("Enter Account number: ");
            int num = sc.nextInt();

            // Step 2: Fetch and display current balance
            String query1 = "SELECT balance FROM account WHERE num = ?";
            PreparedStatement ps1 = con.prepareStatement(query1);
            ps1.setInt(1, num);
            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                int balance = rs.getInt(1); // here we get balance from query1
                System.out.println("Current available balance: " + balance);

                // Step 3: Enter withdrawal amount
                System.out.print("Enter withdraw amount: ");
                int amt = sc.nextInt();

                if (amt <= balance) {
                    // Step 4: Withdraw money (Update balance)
                    String query2 = "UPDATE account SET balance = balance - ? WHERE num = ?";
                    PreparedStatement ps2 = con.prepareStatement(query2);
                    ps2.setInt(1, amt);
                    ps2.setInt(2, num);
                    ps2.executeUpdate();
                    System.out.println("Withdraw Successful..");

                    // Step 5: Fetch and display updated balance
                    String query3 = "SELECT balance FROM account WHERE num = ?";
                    PreparedStatement ps3 = con.prepareStatement(query3);
                    ps3.setInt(1, num);
                    ResultSet rsUpdated = ps3.executeQuery();

                    if (rsUpdated.next()) {
                        int updatedBalance = rsUpdated.getInt(1);
                        System.out.println("Updated available balance: " + updatedBalance);
                    }
                } else {
                    System.out.println("Error: Insufficient Balance");
                }

            } else {
                System.out.println("Error: Invalid Account Number");
            }

        } finally {
            if (con != null) {
                con.close();
                System.out.println("Connection closed");
            }
        }
    }
}
