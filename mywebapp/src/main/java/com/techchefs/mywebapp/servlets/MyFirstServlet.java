package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyFirstServlet extends HttpServlet {
	
	public MyFirstServlet() {
		System.out.println("Inside constructor");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String httpMethod = req.getMethod();
		String protocol = req.getProtocol();
		String requestUrl = req.getRequestURL().toString();
		
		System.out.println("HTTP methods =====>"+httpMethod);
		System.out.println("protocol methods =====>"+protocol);
		System.out.println("requestUrl methods =====>"+requestUrl);
		
		String currentDateTime = new Date().toString(); 
		
		String fnameValue = req.getParameter("fname");
		
		String lnameValue = req.getParameter("lname");
		
		String htmlResponse = 	"<!DOCTYPE html>"+
								"<html>"+ 
								"<head>"+
								"<meta charset=\"ISO-8859-1\">"+
								"<title>My First HTML</title>"+
								"</head>"+
								"<body>"+
								"<h1> My name is: "+fnameValue+" "+lnameValue+"<h1> <br/>"+
								"	<h1>Current date and time : <br/>"+
								"	<span style=\"color:red\">"+ currentDateTime +"</span>"+ 
								"</h1>"+
								"</body>"+
								"</html>";
		
		resp.setContentType("text/html");
		/* resp.setHeader("Refresh", "1"); */
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);
	}
}
