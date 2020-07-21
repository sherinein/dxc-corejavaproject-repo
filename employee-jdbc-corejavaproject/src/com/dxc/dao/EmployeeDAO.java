package com.dxc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.dxc.model.Employee;

// write the jdbc
public class EmployeeDAO {
	
	// jdbc connection
	public boolean registerEmployeeDetails(Employee employee) throws SQLException{
		boolean result=false;
		//Create Connection object
		Connection connection =DbConnection.getConnection();

		// Create Statement object
		Statement statement=connection.createStatement();
		int empid=employee.getEmpid();
		String empname=employee.getEmpname();
		double salary=employee.getSalary();
		// 
		String sql="insert into employee value("+empid+",'"+empname+"',"+salary+")";
		int count=statement.executeUpdate(sql);
		if(count>0) {
		System.out.println("No of employee inserted is "+count);
		result=true;
		}
		return result;
	}
	
	

}
