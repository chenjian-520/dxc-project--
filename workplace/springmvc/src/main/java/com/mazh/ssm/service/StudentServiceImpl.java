package com.mazh.ssm.service;

import java.util.List;

import com.mazh.ssm.mapper.StudentMapper;
import com.mazh.ssm.pojo.GroupAge;
import com.mazh.ssm.pojo.Student;
import com.mazh.ssm.pojo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired(required = true)
	private StudentMapper studentMapper;

	@Override
	public List<Student> getAllStudent() throws Exception {
		
		return studentMapper.getAllStudent();
	}

	@Override
	public Student getOneStudent(int id) throws Exception {
		return studentMapper.getOneStudent(id);
	}

	@Override
	public void insertStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.insertStudent(student);
	}

	@Override
	public void updateStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.updateStudent(student);
	}

	@Override
	public void deleteStudent(int id) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.deleteStudent(id);
	}

	@Override
	public List<Student> getAllStudentsWhere(Student student) throws Exception {
		// TODO Auto-generated method stub
		return studentMapper.getAllStudentsWhere(student);
	}

	@Override
	public void deleteCheckStudents(int[] ids) throws Exception {
		for(int id : ids){
			studentMapper.deleteStudent(id);
		}
	}

	@Override
	public void updateAllStudent(StudentVO studentVO) throws Exception {
		// TODO Auto-generated method stub
		for(Student student :  studentVO.getStudentList()){
			studentMapper.updateStudent(student);
		}
	}

	@Override
	public List<GroupAge> groupByAge() throws Exception {

		return studentMapper.groupByAge();
	}
}
