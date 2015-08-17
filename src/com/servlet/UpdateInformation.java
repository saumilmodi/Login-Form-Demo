package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateInformation{
		public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn =DBUtil.getConnection();
		String query="update applecustomers set password=?,firstname=?,lastname=?,mobilenumber=?,pincode=?,gender=?,birthdate=? where username=?";
		try {
			String UserName=request.getParameter("UserName");
			String Password=request.getParameter("Password");
			String FirstName=request.getParameter("FirstName");
			String LastName=request.getParameter("LastName");
			Long MobileNumber=Long.parseLong(request.getParameter("MobileNumber"));
			String Gender=request.getParameter("Gender");
			String Birthdate=request.getParameter("Birthdate").toString();
			Long Pincode=Long.parseLong(request.getParameter("RecoveryPincode"));
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1,Password);
			ps.setString(2,FirstName);
			ps.setString(3,LastName);
			ps.setLong(4,MobileNumber);
			ps.setLong(5,Pincode);
			ps.setString(6,Gender);
			ps.setString(7,Birthdate);
			ps.setString(8,UserName);
			int result=ps.executeUpdate();
			
			if(result>0)
				response.sendRedirect("Welcome.jsp");
			else
				response.sendRedirect("UpdateInformation.jsp?msg=Can not update Information.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	
	
	}
}
