package com.cn.hpe.homework2;

public class Employee {
	public String name;
	public double salary;
	public int days;
	
	public Employee(String name, double salary, int days) {
		super();
		this.name = name;
		this.salary = salary;
		this.days = days;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", days=" + days + "]";
	}

	// 1.计算工资
	public double computeSalary() {
		return salary * days;
	};
}
