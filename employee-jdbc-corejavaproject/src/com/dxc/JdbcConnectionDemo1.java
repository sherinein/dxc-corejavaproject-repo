package com.dxc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionDemo1 {
	private static Connection connection=null;
	private static Statement statement=null;
	private static ResultSet resultSet=null;

	public static void main(String[] args) {

		/*
		 * // 1. Load the JDBC driver. try { 
		 * Class.forName("com.mysql.jdbc.Driver");// This driver is deprecated
		 * Class.forName("com.mysql.cj.jdbc.Driver"); // This driver for mysql 8
		 * 
		 * System.out.println("Driver is loaded successfully");
		 * 
		 * } catch (Exception e) { System.out.println(e); }
		 */

		// 2. Define the connection URL.

		String mySqlUrl = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "root";

		// 3. Establish the connection.
		try {
			connection = DriverManager.getConnection(mySqlUrl, username, password);
			System.out.println("Mysql connection is established");

			// 4. Create a statement object.
			 statement = connection.createStatement();

			// 5. Execute a query or update.
			/*
			 * int id=101; String name="lynet"; double salary=40000d;
			 */
			 String sql = "insert into employee(empid,empname,salary)values(124,'colet',40000)";
			 statement.executeUpdate(sql);
			
			// 6. Process the results.
			String sqlQuery = "select * from employee where salary>30000";
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				System.out.println("Employee id is " + resultSet.getInt(1));
				System.out.println("Employee Name is " + resultSet.getString(2));
				System.out.println("Employee salary is " + resultSet.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 7. Close the connection.		
		finally {
			try {
				statement.close();
				resultSet.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
