package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("11111111111111111111");
		
		out.print("<BR>");
		dispatcher =request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);
		out.print("<BR>");
		
		out.println("222222222222222222222");
		
		out.print("<BR>");
		dispatcher =request.getRequestDispatcher("currentDate?fname=Deekshit&lname=Raju");
		dispatcher.include(request, response);
		out.print("<BR>");
		
		out.println("3333333333333333333333");
		
		out.print("<BR>");
		dispatcher =request.getRequestDispatcher("search?empId=1");
		dispatcher.include(request, response);
		out.print("<BR>");
		
		out.println("4444444444444444444444444");
	}

}
