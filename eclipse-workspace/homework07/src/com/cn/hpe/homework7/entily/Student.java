package com.cn.hpe.homework7.entily;

public class Student {
	private int id;
	private int tid;
	private String name;
	private String sclass;
	private String grade;
	private String input_date;
	
	
	
	public Student(int id, int tid, String name, String sclass, String grade, String input_date) {
		super();
		this.id = id;
		this.tid = tid;
		this.name = name;
		this.sclass = sclass;
		this.grade = grade;
		this.input_date = input_date;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getInput_date() {
		return input_date;
	}

	public void setInput_date(String input_date) {
		this.input_date = input_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + id;
		result = prime * result + ((input_date == null) ? 0 : input_date.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sclass == null) ? 0 : sclass.hashCode());
		result = prime * result + tid;
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
		Student other = (Student) obj;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (id != other.id)
			return false;
		if (input_date == null) {
			if (other.input_date != null)
				return false;
		} else if (!input_date.equals(other.input_date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sclass == null) {
			if (other.sclass != null)
				return false;
		} else if (!sclass.equals(other.sclass))
			return false;
		if (tid != other.tid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", tid=" + tid + ", name=" + name + ", sclass=" + sclass + ", grade=" + grade
				+ ", input_date=" + input_date + "]";
	}

	
}
