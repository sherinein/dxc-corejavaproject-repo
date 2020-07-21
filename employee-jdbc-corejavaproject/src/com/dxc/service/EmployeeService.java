package com.dxc.service;

import java.sql.SQLException;

import com.dxc.dao.EmployeeDAO;
import com.dxc.model.Employee;

public class EmployeeService {
	
	private Employee employee;
	private EmployeeDAO employeeDao;
	
	public boolean registerEmployee(Employee e) {
		employeeDao=new EmployeeDAO();
		boolean result=false; // local variable must be initialize
		// business logic
		
		try {
			result=employeeDao.registerEmployeeDetails(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		return result;
	}
	
	
	

}
