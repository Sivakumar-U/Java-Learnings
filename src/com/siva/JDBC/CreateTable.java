/**
 * 
 */
package com.siva.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Statement: It is used for executing static queries.(such as DDL command(Create,alter, drop, truncate queries))
 * ---------- 
 * PreparedStatement: It is used for executing dynamic queries.(such as DML(Insert,update,delete queries),DRL(only Select queries) commands)
 * ------------------
 */
public class CreateTable {

	public static void main(String[] args) throws Exception { // Instead of throwing different exceptions here we can simply use Exception.
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

			String query = "create table register(username varchar(20), password varchar(20))";
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("Table created");
		} finally { // we can have finally block without catch block.
			if (con != null) {
				con.close();
				System.out.println("Connection closed");
			}

		}

	}

}
