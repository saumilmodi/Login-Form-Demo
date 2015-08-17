package com.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout {
public void execute(HttpServletRequest request,HttpServletResponse response)
{
	HttpSession session=request.getSession();
	session.invalidate();
	try {
		response.sendRedirect("Login.jsp");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
