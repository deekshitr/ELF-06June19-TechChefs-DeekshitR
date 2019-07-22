package com.techchefs.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techchefs.emp.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
@WebServlet("/profile")
public class EmployeeProfileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Validate the session
				HttpSession httpSession = req.getSession(false);
				
				
				if (httpSession == null) {
					String url = "login.html";
					resp.sendRedirect(url);
				} else {
					
					EmployeeInfoBean empInfo = (EmployeeInfoBean) httpSession.getAttribute("userInfo");
					log.info("empInfo from session "+ empInfo);
					PrintWriter out = resp.getWriter();
					
					out.print("<HTML>");
					out.print("<BODY>");
					out.print("<H1 style=\"color:green\">EMPLOYEE FOUND...</H1>");
					out.print("<BR/>");
					out.print("<BR/>	id             : " + empInfo.getId());
					out.print("<BR/>	name           : " + empInfo.getName());
					out.print("<BR/>	age            : " + empInfo.getAge());
					out.print("<BR/>	gender         : " + empInfo.getGender());
					out.print("<BR/>	salary         : " + empInfo.getSalary());
					out.print("<BR/>	phone          : " + empInfo.getPhone());
					out.print("<BR/>	joining_date   : " + empInfo.getJoiningDate());
					out.print("<BR/>	acc_num        : " + empInfo.getAccNum());
					out.print("<BR/>	email          : " + empInfo.getEmail());
					out.print("<BR/>	designation    : " + empInfo.getDesignation());
					out.print("<BR/>	dob            : " + empInfo.getDob());
					out.print("<BR/>	dept_id        : " + empInfo.getDepartmentId());
					out.print("<BR/>	manager_id     : " + empInfo.getManagerId());
					out.print("<BR/>");
					out.print("</BODY>");
					out.print("</HTML>");
				}
	}
}
