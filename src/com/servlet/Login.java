package com.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login {
public void execute(HttpServletRequest request,HttpServletResponse response)
{
	Connection conn =DBUtil.getConnection();
	ServletContext context=request.getServletContext();
	String query="select * from applecustomers where username=? and password=?";
	try {
		PreparedStatement ps=conn.prepareStatement(query);
		String UserName=request.getParameter("UserName");
		String Password=request.getParameter("Password");
		ps.setString(1,UserName);
		ps.setString(2,Password);
		int result=ps.executeUpdate();
		
		if(result>0)
		{
			HttpSession session=request.getSession();
			session.setAttribute("UserName",UserName);
			context.setAttribute("UserName",UserName);
			response.sendRedirect("Welcome.jsp");
		}
		else
			response.sendRedirect("Login.jsp?msg=Invalid UserName or Password.");
	}
	catch (Exception e) {
		e.printStackTrace();
	}

}
}
