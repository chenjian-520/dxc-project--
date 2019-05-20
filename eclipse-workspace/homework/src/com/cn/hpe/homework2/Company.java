package com.cn.hpe.homework2;

import java.util.ArrayList;
import java.util.List;

public class Company {

	public List<Employee> employees;

	public Company() {
		super();
		employees = new ArrayList<>();
	}

	// add employee
	public boolean registerEmployee(Employee employee) {
		boolean add = employees.add(employee);
		if (add) {
			return true;
		} else {
			return false;
		}
	}

	// 1.计算所有薪水
	public double computeSalary() {
		double money = 0.0;
		for (Employee a : employees) {
			money += a.computeSalary();
		}
		return money;
	}

	public static void main(String[] args) {
		Employee manager = new Employee("d", 3, 90);
		Employee secretary = new Employee("s", 6, 90);
		Company company = new Company();
		System.out.println(company.registerEmployee(manager));
		System.out.println(company.registerEmployee(secretary));
		System.out.println(company.computeSalary());

	}
}
