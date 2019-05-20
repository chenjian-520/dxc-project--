package com.cn.hpe.homework7.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cn.hpe.homework7.dao.StrdentDao;
import com.cn.hpe.homework7.entily.Student;
import com.cn.hpe.homework7.util.UtilJdcb1;

public class StudentDaoImpl implements StrdentDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int rows = 0;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> student = new ArrayList<>();
		try {
			//获取连接对象 
			conn = UtilJdcb1.getuser();
			String sqlString = "select * from t_student";
			//发送sql
			ps = conn.prepareStatement(sqlString);
			//获取结果
			rs = ps.executeQuery();
			while (rs.next()) {
				Student st = new Student();

				st.setId(rs.getInt("id"));
				st.setTid(rs.getInt("tid"));
				st.setName(rs.getString("name"));
				st.setSclass(rs.getString("sclass"));
				st.setGrade(rs.getString("grade"));
				st.setInput_date(rs.getString("input_date"));

				student.add(st);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			UtilJdcb1.getclose(conn, ps, rs);
		}

		return student;
	}

	@Override
	public Student findOne(int id2) {
		// TODO Auto-generated method stub
		Student st = new Student();
		
		try {
			conn=UtilJdcb1.getuser();
			String sqlString = "select * from t_student where id = ?";
			ps = conn.prepareStatement(sqlString);
			ps.setInt(1,id2);
			rs=ps.executeQuery();
			
			rs.next();
			st.setId(rs.getInt("id"));
			st.setTid(rs.getInt("tid"));
			st.setName(rs.getString("name"));
			st.setSclass(rs.getString("class"));
			st.setGrade(rs.getString("grade"));
			st.setInput_date(rs.getString("input_date"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			UtilJdcb1.getclose(conn, ps, rs);
		}
		
		return st;
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		try {
			conn = UtilJdcb1.getuser();
			String sqlString = "insert into t_student(id,tid,name,class,grade,input_date) values(?,?,?,?,?,?)";
			ps = conn.prepareStatement(sqlString);
			ps.setInt(1, student.getId());
			ps.setInt(2, student.getTid());
			ps.setString(3, student.getName());
			ps.setString(4, student.getSclass());
			ps.setString(5, student.getGrade());
			ps.setString(6, student.getInput_date());
			
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			UtilJdcb1.getclose(conn, ps, rs);
		}
		return rows;
	}

	@Override
	public int delect(int id) {
		// TODO Auto-generated method stub
		try {
			conn = UtilJdcb1.getuser();
			String sqlString = "delete from t_student where id = ?";
			ps = conn.prepareStatement(sqlString);
			ps.setInt(1, id);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			UtilJdcb1.getclose(conn, ps, rs);
		}
		return rows;
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		try {
			conn = UtilJdcb1.getuser();
			String sqlString = "update t_student set tid=?,class=?,grade=?,input_date=? where id = ? ";
			ps = conn.prepareStatement(sqlString);
			ps.setInt(1, student.getTid());
			ps.setString(2, student.getSclass());
			ps.setString(3, student.getGrade());
			ps.setString(4, student.getInput_date());
			ps.setInt(5, student.getId());
			
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			UtilJdcb1.getclose(conn, ps, rs);
		}
		return rows;
	}

}
