package com.cn.hpe.homework3;

public class Secretary extends Employee {

	public Secretary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretary(String name, double salary, int days) {
		super(name, salary, days);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return this.getSalary() * this.getDays();
	}

	@Override
	public String toString() {
		return "Secretary [toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	
	
}
