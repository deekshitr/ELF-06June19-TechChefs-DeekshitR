package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;

public class MyFirstServlet extends HttpServlet {

	public MyFirstServlet() {
		System.out.println("Inside constructor");
	}

	@Override
	protected synchronized void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");

		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");

		String httpMethod = req.getMethod();
		String protocol = req.getProtocol();
		String requestUrl = req.getRequestURL().toString();

		System.out.println("HTTP methods =====>" + httpMethod);
		System.out.println("protocol methods =====>" + protocol);
		System.out.println("requestUrl methods =====>" + requestUrl);

		String currentDateTime = new Date().toString();

		String fnameValue = req.getParameter("fname");

		String lnameValue = req.getParameter("lname");

		String htmlResponse = "<!DOCTYPE html>" + "<html>" + "<head>" + "<meta charset=\"ISO-8859-1\">"
				+ "<title>My First HTML</title>" + "</head>" + "<body>" + "<h1> My name is: " + fnameValue + " "
				+ lnameValue + "<h1> <br/>" + "	<h1>Current date and time : <br/>" + "	<span style=\"color:red\">"
				+ currentDateTime + "</span>" + "</h1>" + "<h1> Movie Name : " + movieName + " </h1>"
				+ "<h1> Actor Name : " + actorName + " </h1>" + "</body>" + "</html>";

		resp.setContentType("text/html");
		/* resp.setHeader("Refresh", "1"); */
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);

		// Get the obj from forward servlet
		EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) ctx.getAttribute("info");

		if (employeeInfoBean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<BR/>");
			out.print("<H1 style=\"color:red\">EMPLOYEEINFOBEAN OBJECT NOT FOUND</H1>");
			out.print("</BODY>");
			out.print("</HTML>");

		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1 style=\"color:green\">EMPLOYEEINFOBEAN OBJECT FOUND...</H1>");
			out.print("<BR/>");
			out.print("<BR/>	id             : " + employeeInfoBean.getId());
			out.print("<BR/>	name           : " + employeeInfoBean.getName());
			out.print("<BR/>	phone          : " + employeeInfoBean.getPhone());
			out.print("<BR/>	email          : " + employeeInfoBean.getEmail());
			out.print("<BR/>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
	}
}
