package com.cn.hpe.homework7.entily;

public class Teacher {
	private int id;
	private String name;
	private String adress;
	private int age;
	private String sex;
	private String input_date;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String adress, int age, String sex, String input_date) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.age = age;
		this.sex = sex;
		this.input_date = input_date;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", adress=" + adress + ", age=" + age + ", sex=" + sex
				+ ", input_date=" + input_date + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((input_date == null) ? 0 : input_date.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		Teacher other = (Teacher) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (age != other.age)
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
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	
	
}
