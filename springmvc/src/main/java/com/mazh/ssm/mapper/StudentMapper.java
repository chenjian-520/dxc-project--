package com.mazh.ssm.mapper;

import java.util.List;

import com.mazh.ssm.pojo.GroupAge;
import com.mazh.ssm.pojo.Student;

/**
 * 动态代理mapper类
 * 接口规范：
 * 1、studentMapper.xml的namespace得和该mapper的全限定类名一样
 * 2、该mapper的方法名得和studentMapper.xml中的statement的id一样
 * 3、该mapper的每个方法的输入参数得和对应statement的parameterType一样
 * 4、该mapper的每个方法的输出结果类型得和对应的statement的resultType一样
 * 
 * 完整的编写mapper的流程：
 * 1、编写studentMapper.xml，然后加入sqlMapConfig.xml的mapper配置中
 * 2、编写studentMapper.xml中的statement，也就是写SQL语句
 * 3、编写接口StudentMapper.class，切记，编写的Mapper的全限定名 必须 和 studentMapper.xml的namespace一样
 * 4、在该接口mapper-StudentMapper中编写方法，该方法的标准就是上面所说的最后三条
 * 5、最后测试
 */
public interface StudentMapper {

	public List<Student> getAllStudent() throws Exception;
	
	public Student getOneStudent(int id) throws Exception;
	
	public void insertStudent(Student student) throws Exception;
	
	public void updateStudent(Student student) throws Exception;
	
	public void deleteStudent(int id) throws Exception;
	
	public List<Student> getAllStudentsWhere(Student student) throws Exception;

	public List<GroupAge> groupByAge() throws Exception;
}
