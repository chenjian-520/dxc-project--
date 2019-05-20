package com.cn.hpe.homework3;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private  List<Employee> employees;
	
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		return true;
	}

	public Company() {
		super();
		employees = new ArrayList<>();
		// TODO Auto-generated constructor stub
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
		Employee manager = new Manager("d", 3, 90);
		Employee secretary = new Secretary("s", 6, 90);
		Company company = new Company();
		
		System.out.println(company.registerEmployee(manager) +"   "+manager.toString());
		System.out.println(company.registerEmployee(secretary) +"   "+secretary.toString());
		System.out.println(company.computeSalary());

	}

}
