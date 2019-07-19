package com.techchefs.emp.servlets;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techchefs.emp.beans.EmployeeInfoBean;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
@WebServlet("/searchemp")
public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Validate the session
		HttpSession httpSession = req.getSession(false);
		
		if (httpSession == null) {
			String url = "login.html";
			resp.sendRedirect(url);
		} else {
			
			log.info("httpSession "+ httpSession);
			String empSearchValue = req.getParameter("empSearch");
			
			log.info("idValue"+empSearchValue);
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			EmployeeInfoBean empBean = dao.getEmployeeInfo(empSearchValue);
			
			PrintWriter out = resp.getWriter();
			
			if (empBean == null) {
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<BR/>");
				out.print("<H1 style=\"color:red\">EMPLOYEE NOT FOUND</H1>");
				out.print("</BODY>");
				out.print("</HTML>");
				
			} else {
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1 style=\"color:green\">EMPLOYEE FOUND...</H1>");
				out.print("<BR/>");
				out.print("<BR/>	id             : " + empBean.getId());
				out.print("<BR/>	name           : " + empBean.getName());
				out.print("<BR/>	age            : " + empBean.getAge());
				out.print("<BR/>	gender         : " + empBean.getGender());
				out.print("<BR/>	salary         : " + empBean.getSalary());
				out.print("<BR/>	phone          : " + empBean.getPhone());
				out.print("<BR/>	joining_date   : " + empBean.getJoiningDate());
				out.print("<BR/>	acc_num        : " + empBean.getAccNum());
				out.print("<BR/>	email          : " + empBean.getEmail());
				out.print("<BR/>	designation    : " + empBean.getDesignation());
				out.print("<BR/>	dob            : " + empBean.getDob());
				out.print("<BR/>	dept_id        : " + empBean.getDepartmentId());
				out.print("<BR/>	manager_id     : " + empBean.getManagerId());
				out.print("<BR/>");
				out.print("</BODY>");
				out.print("</HTML>");
				
			}
		}
	}
}
