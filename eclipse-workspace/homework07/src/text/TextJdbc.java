package text;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

import com.cn.hpe.homework7.dao.impl.StudentDaoImpl;
import com.cn.hpe.homework7.dao.impl.TeacherDaoImpl;
import com.cn.hpe.homework7.entily.Student;
import com.cn.hpe.homework7.entily.Teacher;

public class TextJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDaoImpl stu1 = new StudentDaoImpl();
		List<Student> findAll = stu1.findAll();
		findAll.forEach(t->System.out.println(t));
//		
//		Student findOne = stu1.findOne(1);
//		System.out.println(findOne.toString());
		
//		Date now = new Date(); 
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
//		String hehe = dateFormat.format( now );
//		Student student = new Student(4,2,"李武","403","四年级",hehe);
//		int insert = stu1.insert(student);
//		System.out.println(insert);
//		List<Student> findAll = stu1.findAll();
//		findAll.forEach(t->System.out.println(t));
		
		
//		Date now = new Date(); 
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
//		String hehe = dateFormat.format( now );
//		Student student = new Student(4,2,"李武","503","五年级",hehe);
//		int update = stu1.update(student);
//		System.out.println(update);
//		List<Student> findAll = stu1.findAll();
//		findAll.forEach(t->System.out.println(t));
		
//		int i = stu1.delect(4);
//		System.out.println(i);
//		List<Student> findAll = stu1.findAll();
//		findAll.forEach(t->System.out.println(t));
		
//		TeacherImpl tea1 = new TeacherImpl();
//		List<Teacher> findAll = tea1.findAll();
//		findAll.forEach(t->System.out.println(t));
		
	}

}
