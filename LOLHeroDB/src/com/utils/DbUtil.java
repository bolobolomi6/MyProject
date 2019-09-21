package com.utils;

import java.sql.*;

public class DbUtil {
	 public Connection con;
	 public PreparedStatement pt;
	 public ResultSet rs;

	private void getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cslg?useUnicode=true&characterEncoding=utf8","root","0000"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int executeUpdate(String sql, Object... list) {
		int n = 0;
		getConn();
		try {
			pt = con.prepareStatement(sql);  
			for (int i = 0;list!=null&& i < list.length; i++) {
				pt.setObject(i + 1, list[i]);
			}			
			n = pt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}

	public ResultSet executeQuery(String sql, Object... list) {
		getConn();
		try {
			pt = con.prepareStatement(sql);  
			for (int i = 0;list!=null&& i < list.length; i++) {
				pt.setObject(i + 1, list[i]);
			}
			
			rs = pt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public void closeAll() {
		try {
			if (rs != null) {
				rs.close();
			}

			if (pt != null) {
				pt.close();
			}

			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}