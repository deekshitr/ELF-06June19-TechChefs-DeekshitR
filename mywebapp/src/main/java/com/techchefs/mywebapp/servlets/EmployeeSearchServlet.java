package com.techchefs.mywebapp.servlets;

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

import com.techchefs.mywebapp.beans.EmployeeInfoBean;
import com.techchefs.mywebapp.dao.EmployeeDAO;
import com.techchefs.mywebapp.dao.EmployeeDAOFactory;

@WebServlet(urlPatterns="/search",
		initParams= {
				@WebInitParam(name="actress", value="Basanti")
		})
public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");
		
		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		String actressName = config.getInitParameter("actress");
		
		String idValue = req.getParameter("empId");
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean empBean = dao.getEmployeeInfo(idValue);
		
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
			out.print("<BR/>	MovieName        : " + movieName);
			out.print("<BR/>	ActorName     : " + actorName);
			out.print("<BR/>");
			out.print("<BR/>");
			out.print("<BR/>	Movie Name        : " + movieName);
			out.print("<BR/>	Actress Name     : " + actressName);
			out.print("<BR/>");
			out.print("</BODY>");
			out.print("</HTML>");
			
		}
		
		//Get the obj from forward servlet
//		EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) req.getAttribute("info");
		
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
