package com.dxc;

import java.util.Scanner;

import com.dxc.model.Child;
import com.dxc.model.Employee;
import com.dxc.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
			
		EmployeeService service=new EmployeeService();
		Employee emp=new Employee();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employee to register");
			
		int noOfEmp=Integer.parseInt(s.nextLine());
		// Setter Method example
		boolean result=service.register(emp,s,noOfEmp);
			if(result) {
				service.display();
				System.out.println("Employee registered successfully");
			}
			else
				System.out.println("Employee is not registed");
			
		// Constructor example
		boolean result1=service.registerEmployee(s,noOfEmp);
			if(result1) {
				service.display();
				System.out.println("Employee registered successfully");
			}
			else
				System.out.println("Employee is not registed");	

	}

}
