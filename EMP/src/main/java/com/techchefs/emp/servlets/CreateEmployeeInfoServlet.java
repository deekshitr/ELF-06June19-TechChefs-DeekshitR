package com.techchefs.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.techchefs.emp.beans.EmployeeInfoBean;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
@WebServlet("/createemployee")
public class CreateEmployeeInfoServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(Integer.parseInt(req.getParameter("empId")));
		log.info("empId "+Integer.parseInt(req.getParameter("empId")));
		empInfo.setPassword(req.getParameter("empPassword"));
		empInfo.setName(req.getParameter("empName"));
		empInfo.setAge(Integer.parseInt(req.getParameter("empAge")));
		empInfo.setGender(req.getParameter("empGender"));
		empInfo.setSalary(Double.parseDouble(req.getParameter("empSalary")));
		empInfo.setPhone(Long.parseLong(req.getParameter("empPhoneNum")));
		try {
			empInfo.setJoiningDate(dateFormat.parse(req.getParameter("empJoiningDate")));
			empInfo.setDob(dateFormat.parse(req.getParameter("empDOB")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		empInfo.setAccNum(Long.parseLong(req.getParameter("empAccNum")));
		empInfo.setEmail(req.getParameter("empEmailId"));
		empInfo.setDesignation(req.getParameter("empDesignation"));
		
		empInfo.setDepartmentId(Integer.parseInt(req.getParameter("empDeptId")));
		empInfo.setManagerId(Integer.parseInt(req.getParameter("empManagerId")));
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean empSave = dao.createEmployeeInfo(empInfo);
		
		PrintWriter out = resp.getWriter();
		log.info("before empSave"+ empSave);
		if (empSave) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<span style=\"color:green\">EMPLOYEE INSERTED SUCCESSFULLY</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<span style=\"color:red\">EMPLOYEE NOT INSERTED</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		log.info("afterempSave"+ empSave);
		
	}
}
