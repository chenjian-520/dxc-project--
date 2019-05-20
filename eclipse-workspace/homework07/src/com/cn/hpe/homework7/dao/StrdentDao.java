package com.cn.hpe.homework7.dao;

import java.util.List;

import com.cn.hpe.homework7.entily.Student;


public interface StrdentDao {
	//1查询全表
	public abstract List<Student> findAll();
	//2根据id来查询
	public abstract Student findOne(int id);
	//3添加一行数据
	public abstract int insert(Student student);
	//4通过学生ID删除
	public abstract int delect(int id);
	//5通过对象修改一行
	public abstract int update(Student teacher);
}
