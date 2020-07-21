package com.dxc.model;

public class Parent {
	private double money;

	public Parent(double money) {
		super();
		this.money = money;
		System.out.println("Parent Recieved Money "+money);
	}
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	private void meth() {
		System.out.println("welcome");
	}
	
}
