package com.dxc;

import java.util.Scanner;

import com.dxc.model.Employee;
import com.dxc.service.EmployeeService;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("Enter the Employee id :");
		employee.setEmpid(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter the Employee Name: ");
		employee.setEmpname(scanner.nextLine());
		System.out.println("Enter the employee Salary ");
		employee.setSalary(Double.parseDouble(scanner.nextLine()));
		EmployeeService employeeService =new EmployeeService();
		
		boolean result=employeeService.registerEmployee(employee);
		if(result)
			System.out.println("Employee registerd successfully");
		else
			
			System.out.println("Employee not registerd");
	}

}
