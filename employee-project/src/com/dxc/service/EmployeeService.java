package com.dxc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dxc.model.Employee;

public class EmployeeService {
	
	private List<Employee> emplist=new ArrayList<Employee>();
	private List<Employee> emplist1=new ArrayList<Employee>();
	
	// Setter Method
	public boolean register(Employee emp, Scanner s,int noOfEmp) {
		boolean result=false;
		for(int i=0;i<noOfEmp;i++) {
		System.out.println("Enter the emp id ");
		emp.setEmpId(Integer.parseInt(s.nextLine()));
		System.out.println("Enter the emp name");
		emp.setEmpName(s.nextLine());
		System.out.println("Enter the emp salary");
		emp.setEmpSalary(Double.parseDouble(s.nextLine()));
		emplist.add(emp);
		
		}
		if(emplist.size()!=0) {
			System.out.println("Number of employee is "+emplist.size());
			result=true;
		}
		return result;
	}
	
	public void display() {
		Iterator<Employee> iterator=emplist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); // return emp object Employee emp=iterator.next();
		}
	
	}
	// Constructor
	public boolean registerEmployee(Scanner s,int noOfEmp) {
		boolean result=false;
		Employee emp;
		for(int i=0;i<noOfEmp;i++) {
			System.out.println("Enter the emp id ");
			int empid=Integer.parseInt(s.nextLine());
			System.out.println("Enter the emp name");
			String ename=s.nextLine();
			System.out.println("Enter the emp salary");
			double salary=Double.parseDouble(s.nextLine());
			emp=new Employee(empid,ename,salary);
			emplist1.add(emp);
		}
		
		return result;
	}
	
	public void displayEmployee() {
		Iterator<Employee> iterator=emplist1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); // return emp object Employee emp=iterator.next();
		}
	
	}

}
