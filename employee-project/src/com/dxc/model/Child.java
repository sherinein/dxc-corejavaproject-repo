package com.dxc.model;

public class Child extends Parent {
	private double money1;
	
	public Child(double money1, double j) {
		super(j); /// to call super class constructor
		this.money1=money1;
		System.out.println("Child money recieved" +money1);
	}
	void diplay() {
		//meth();
	}

}
