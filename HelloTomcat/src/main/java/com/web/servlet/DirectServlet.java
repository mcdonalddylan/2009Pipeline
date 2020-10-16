package com.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Connector;

@WebServlet(name = "direct", urlPatterns = {"/direct"}, loadOnStartup = 0)
public class DirectServlet extends HttpServlet {

	Connector con = new Connector();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>This is direct</h1>");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("being intialized");
		super.init();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servicing my guyyyy");
		super.service(req, res);
	}
	
	@Override
	public void destroy() {
		System.out.println("good byeeeeee");
		super.destroy();
	}
}
