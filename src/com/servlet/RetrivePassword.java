package com.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.CustomerRecovery;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
class RetrivePassword
{
public void execute(HttpServletRequest request,HttpServletResponse response)
{
	Connection conn =DBUtil.getConnection();
	ServletContext context=request.getServletContext();
	String query="select username,password from applecustomers where username=? and pincode=?";
	try {
		PreparedStatement ps=conn.prepareStatement(query);
		String UserName=request.getParameter("UserName");
		String Pincode=request.getParameter("RecoveryPincode");
		context.setAttribute("UserName", UserName);
		ps.setString(1,UserName);
		ps.setString(2,Pincode);
		ResultSet rs=ps.executeQuery();
		List<CustomerRecovery> customerRecoveryList=new ArrayList<CustomerRecovery>();
		while(rs.next())
		{
			CustomerRecovery customerRecovery=new CustomerRecovery();
			customerRecovery.setUserName(rs.getString(1));
			customerRecovery.setPassword(rs.getString(2));
			customerRecoveryList.add(customerRecovery);
		}
		RequestDispatcher rd=request.getRequestDispatcher("UsernameAndPasswordRecovery.jsp");
		request.setAttribute("CustomerRecovery",customerRecoveryList);
		rd.forward(request, response);
	}
	catch (Exception e) {
		e.printStackTrace();
	}

}
}