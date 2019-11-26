package com.stuinfomanage.util;

import java.sql.*;

public class DbUtil {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/db_studentinfo?serverTimezone=GMT%2B8";	//数据库地址
	private String dbUserName = "root";	   //用户名
	private String dbPassword = "szj990611";	//密码
	private String jdbcName = "com.mysql.cj.jdbc.Driver";	//数据库驱动
	
	/**
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
	public Connection getCon()throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	/**
	 * 关闭数据库连接
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con) throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
