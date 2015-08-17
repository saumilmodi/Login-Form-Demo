package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateAccount {
public void execute(HttpServletRequest request,HttpServletResponse response)
{
	Connection conn =DBUtil.getConnection();
	String query="insert into applecustomers values(?,?,?,?,?,?,?,?)";
	try {
		PreparedStatement ps=conn.prepareStatement(query);
		String UserName=request.getParameter("UserName");
		String Password=request.getParameter("Password");
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
		Long MobileNumber=Long.parseLong(request.getParameter("MobileNumber"));
		String Birthdate=request.getParameter("Birthdate").toString();
		String Gender=request.getParameter("Gender");
		String Pincode=request.getParameter("RecoveryPincode");
		ps.setString(1,UserName);
		ps.setString(2,Password);
		ps.setString(3,FirstName);
		ps.setString(4, LastName);
		ps.setLong(5,MobileNumber);
		ps.setString(6,Birthdate);
		ps.setString(7,Gender);
		ps.setString(8,Pincode);
		
		int result=ps.executeUpdate();
		if(result>0)
		{
			HttpSession session=request.getSession();
			session.setAttribute("UserName",UserName);
			ServletContext context=request.getServletContext();
			context.setAttribute("UserName",UserName);
			response.sendRedirect("Welcome.jsp");
		}
		else
			response.sendRedirect("CreateAccount.jsp");
		
	} catch (SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
