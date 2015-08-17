package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil 
{
	public static Connection getConnection()
	{
		Connection conn=null;
		try
		{
			String driver="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userName="system";
			String password="manager";
			conn=DriverManager.getConnection(url,userName,password);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
}
