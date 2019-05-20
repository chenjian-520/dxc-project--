package com.cn.hpe.homework7.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;



//jdbc 连接工具类
public class UtilJdcb1 {
	// 1静态代码块 加载驱动
	static {
		Properties properties = new Properties();
		InputStream is = UtilJdcb1.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			properties.load(is);
			is.close();
			Class.forName(properties.getProperty("driver"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 1获取连接对象
	public static Connection getuser() throws SQLException {
		Properties properties = new Properties();
		InputStream is = UtilJdcb1.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			properties.load(is);
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection(
				properties.getProperty("url"), 
				properties.getProperty("username"),
				properties.getProperty("password"));
	}
	//1释放资源
	public static void getclose(Connection conn, PreparedStatement ps , ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
