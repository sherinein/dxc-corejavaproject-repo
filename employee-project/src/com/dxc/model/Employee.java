package com.dxc.model;

public class Employee {
	// properties -3
	private int empId;  // Encapsulation
	private String empName;
	private double empSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int a) {
		System.out.println("value came from child class constructor "+a);
	}
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {              // Employee emp=new Employee(); // System.out.println(emp);
		return "EmpId=" + empId + ", EmpName=" + empName + ", EmpSalary=" + empSalary;
	}
	

}
