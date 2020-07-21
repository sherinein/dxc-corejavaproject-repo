package org.dxc.shopping.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection;

	public static Connection getConnection() {
		String mySqlUrl = "jdbc:mysql://localhost:3306/shoppingdb";
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
