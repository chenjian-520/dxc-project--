package com.cn.hpe.homework7.dao;

import java.util.List;
import com.cn.hpe.homework7.entily.Teacher;


public interface TeacherDao {
	//1查询全表
	public abstract List<Teacher> findAll();
	//2根据id来查询
	public abstract Teacher findOne(int id);
	//3添加一行数据
	public abstract int insert(Teacher teacher);
	//4通过老师ID删除
	public abstract int delect(int id);
	//5通过对象修改一行
	public abstract int update(Teacher teacher);
	
}
