package com.techchefs.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;

/**
 * Servlet implementation class ForwordServlet
 */
public class ForwordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setId(15);
		employeeInfoBean.setName("Deekshit");
		employeeInfoBean.setEmail("dee@gmail.com");
		employeeInfoBean.setPhone(9933774466L);
		
		//Pass the above Object to employeeSearchServlet
		
//		request.setAttribute("info", employeeInfoBean);
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("info", employeeInfoBean); 
		
		
		String url = "search?empId=1";
		
//		String url = "http://www.gmail.com";
		
		RequestDispatcher dispatch = request.getRequestDispatcher(url);
		dispatch.forward(request, response);
	}

}
