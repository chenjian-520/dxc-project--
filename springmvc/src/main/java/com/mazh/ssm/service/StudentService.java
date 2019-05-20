package com.mazh.ssm.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.mazh.ssm.pojo.GroupAge;
import com.mazh.ssm.pojo.Student;
import com.mazh.ssm.pojo.StudentVO;

public interface StudentService {

	public List<Student> getAllStudent() throws Exception;

	public Student getOneStudent(int id) throws Exception;

	public void insertStudent(Student student) throws Exception;

	public void updateStudent(Student student) throws Exception;
	public void updateAllStudent(StudentVO studentVO) throws Exception;

	public void deleteStudent(int id) throws Exception;
	
	public List<Student> getAllStudentsWhere(Student student) throws Exception;
	
	public void deleteCheckStudents(int[] ids) throws Exception;

	public List<GroupAge> groupByAge() throws Exception;
}
