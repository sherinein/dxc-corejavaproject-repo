package com.dxc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static Connection connection;

	public static Connection getConnection() {
		String mySqlUrl = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(mySqlUrl, username, password);
			System.out.println("Mysql connection is established");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
}
