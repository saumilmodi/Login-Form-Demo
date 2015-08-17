package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Customer;

public class FatchInformation {
public void execute(HttpServletRequest request,HttpServletResponse response)
{
	Connection conn =DBUtil.getConnection();
	ServletContext context=request.getServletContext();
	String UserName=(String) context.getAttribute("UserName");
	String query="select * from applecustomers where username=?";
	try {
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1,UserName);
		ResultSet rs=ps.executeQuery();
		List<Customer> customerList=new ArrayList<Customer>();
		while(rs.next())
		{
			Customer customer=new Customer();
			customer.setUserName(rs.getString(1));
			customer.setPassword(rs.getString(2));
			customer.setFirstName(rs.getString(3));
			customer.setLastName(rs.getString(4));
			customer.setMobileNumber(Long.parseLong(rs.getString(5)));
			customer.setBirthdate(rs.getString(6));
			/*customer.setGender(rs.getString(7));*/
			customer.setRecoveryPincode(rs.getString(8));
			customerList.add(customer);
		}
		RequestDispatcher rd=request.getRequestDispatcher("UpdateInformation.jsp");
		request.setAttribute("CustomerList",customerList);
		rd.forward(request, response);
	}
	catch (Exception e) {
		e.printStackTrace();
	}


}
}
