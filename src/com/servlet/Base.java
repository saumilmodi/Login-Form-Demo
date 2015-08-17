package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Base
 */
@WebServlet("/Base")
public class Base extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		System.out.println(action);
		
		if(action.equals("login"))
		{
			Login login=new Login();
			login.execute(request,response);
		}
		else if (action.equals("fatchInformation")) {
			FatchInformation fi=new FatchInformation();
			fi.execute(request, response);
		}
		else if (action.equals("CreateAccount")) {
			CreateAccount ca=new CreateAccount();
			ca.execute(request, response);
		}
		else if (action.equals("logout")) {
			Logout logout=new Logout();
			logout.execute(request, response);
		}
		else if (action.equals("AccountRecovery")) {
			RetrivePassword rp=new RetrivePassword();
			rp.execute(request, response);
		}
		else if (action.equals("UpdateInformation")) {
			UpdateInformation ui=new UpdateInformation();
			ui.execute(request, response);
		}
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
