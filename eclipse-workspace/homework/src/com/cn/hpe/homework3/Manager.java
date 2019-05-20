package com.cn.hpe.homework3;

public class Manager extends Employee {

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, double salary, int days) {
		super(name, salary, days);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() * super.getDays();
	}

	@Override
	public String toString() {
		return "Manager [toString()=" + super.toString() + "]";
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
