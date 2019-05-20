package com.cn.hpe.homework7.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cn.hpe.homework7.dao.TeacherDao;
import com.cn.hpe.homework7.entily.Teacher;
import com.cn.hpe.homework7.util.UtilJdcb1;

public class TeacherDaoImpl implements TeacherDao {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int rows = 0;
	
	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		List<Teacher> teacher = new ArrayList<>();
		try {
			//获取连接对象 
			conn = UtilJdcb1.getuser();
			String sqlString = "select * from t_teacher";
			//发送sql
			ps = conn.prepareStatement(sqlString);
			//获取结果
			rs = ps.executeQuery();
			while (rs.next()) {
				Teacher st = new Teacher();

				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setAdress(rs.getString("address"));	
				st.setAge(rs.getInt("age"));
				st.setSex(rs.getString("sex"));
				st.setInput_date(rs.getString("input_date"));
				
				
				teacher.add(st);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			UtilJdcb1.getclose(conn, ps, rs);
		}

		return teacher;
	}

	@Override
	public Teacher findOne(int id) {
		// TODO Auto-generated method stub
		Teacher st = new Teacher();
		
		try {
			conn=UtilJdcb1.getuser();
			String sqlString = "select * from t_teacher where id = ?";
			ps = conn.prepareStatement(sqlString);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			
			rs.next();
			st.setId(rs.getInt("id"));
			st.setName(rs.getString("name"));
			st.setAdress(rs.getString("address"));	
			st.setAge(rs.getInt("age"));
			st.setSex(rs.getString("sex"));
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
	public int insert(Teacher teacher) {
		// TODO Auto-generated method stub
		try {
			conn = UtilJdcb1.getuser();
			String sqlString = "insert into t_teacher(id,name,address,age,sex,input_date) values(?,?,?,?,?,?)";
			ps = conn.prepareStatement(sqlString);
			ps.setInt(1,teacher.getId());
			ps.setString(2, teacher.getName());
			ps.setString(3, teacher.getAdress());
			ps.setInt(4, teacher.getAge());
			ps.setString(5, teacher.getSex());
			ps.setString(6, teacher.getInput_date());
			
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
			String sqlString = "delete from t_teacher where id = ?";
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
	public int update(Teacher teacher) {
		// TODO Auto-generated method stub
		try {
			conn = UtilJdcb1.getuser();
			String sqlString = "update t_teacher set adress=?,age=?,input_date=? where id = ? ";
			ps = conn.prepareStatement(sqlString);
			ps.setString(1, teacher.getAdress());
			ps.setInt(2, teacher.getAge());
			ps.setString(3, teacher.getInput_date());
			ps.setInt(4, teacher.getId());
			
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
