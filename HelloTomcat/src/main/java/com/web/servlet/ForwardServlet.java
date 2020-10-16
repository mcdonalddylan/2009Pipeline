package com.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println(this.getServletConfig().getInitParameter("servlet"));
		System.out.println(this.getServletName());
		System.out.println(this.getServletContext().getInitParameter("application"));
		//resp.sendRedirect("html/intro.html");
		
		req.getRequestDispatcher("html/login.html").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username;
		String password;
		
		username = req.getParameter("username");
		password = req.getParameter("password");
		
		if(username.equals("john"))
		{
			if(password.equals("bobo"))
			{
				req.getRequestDispatcher("html/success.html").forward(req, resp);
			}
			else
			{
				req.getRequestDispatcher("html/intro.html").forward(req, resp);
			}
		}
		else
		{
			req.getRequestDispatcher("html/intro.html").forward(req, resp);
		}
	}
	

}
