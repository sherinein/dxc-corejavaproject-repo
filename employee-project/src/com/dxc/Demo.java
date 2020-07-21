package com.dxc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dxc.model.Child;
import com.dxc.model.Employee;
import com.dxc.model.Parent;

public class Demo {
	//syxtax
	// List<T> list2=new ArrayList<T>();
	// container -->employee
	List<Employee> list=new ArrayList<Employee>();
	
	List<Parent> list1=new ArrayList<Parent>();
	
	public static void main(String[] args) {
		//Child object=new Child(12000,10000);
		//Parent parent=new Parent();
		Employee emp =new Employee();
		Demo demo=new Demo();
		boolean result=demo.register(emp);
		if(result)
			System.out.println("success");
	}

	public boolean register(Employee emp) {
		boolean result=false;
		
		System.out.println("Enter the emp id ");
		emp.setEmpId(123);
		System.out.println("Enter the emp name");
		emp.setEmpName("Nirmala");
		System.out.println("Enter the emp salary");
		emp.setEmpSalary(30000d);
		list.add(emp);
		
		
		if(list.size()!=0) {
			System.out.println("Number of employee is "+list.size());
			result=true;
		}
		return result;
	}
}
