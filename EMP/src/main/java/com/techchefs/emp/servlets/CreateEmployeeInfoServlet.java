package com.techchefs.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.techchefs.emp.beans.EmployeeInfoBean;
import com.techchefs.emp.beans.EmployeeOtherInfoBean;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
@WebServlet("/createemployee")
public class CreateEmployeeInfoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(Integer.parseInt(req.getParameter("empId")));
		log.info("empId " + Integer.parseInt(req.getParameter("empId")));
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

		EmployeeOtherInfoBean empOtherInfo = new EmployeeOtherInfoBean();
		
		empOtherInfo.setId(Integer.parseInt(req.getParameter("empId")));
		empOtherInfo.setPan(req.getParameter("panNumber"));
		empOtherInfo.setMarried(Boolean.parseBoolean(req.getParameter("isMarried")));
		empOtherInfo.setBloodGrp(req.getParameter("bloodGrp"));
		empOtherInfo.setChallenged(Boolean.parseBoolean(req.getParameter("isChallenged")));
		empOtherInfo.setEmergencyContactName(req.getParameter("empId"));
		empOtherInfo.setEmergencyContactNumber(Long.parseLong(req.getParameter("emergencyContactNumber")));
		empOtherInfo.setNationality(req.getParameter("nationality"));
		empOtherInfo.setReligion(req.getParameter("religion"));
		empOtherInfo.setFatherName(req.getParameter("empId"));
		empOtherInfo.setMotherName(req.getParameter("motherName"));
		empOtherInfo.setSpouseName(req.getParameter("spouseName"));
		empOtherInfo.setPassport(req.getParameter("passportNumber"));
		empOtherInfo.setAdhar(Long.parseLong(req.getParameter("aadharNumber")));

		empInfo.setSetOtherInfo(empOtherInfo);

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean empSave = dao.createEmployeeInfo(empInfo);

		PrintWriter out = resp.getWriter();
		log.info("before empSave" + empSave);
		if (empSave) {
			String url = "./signup-page?signupSuccessMsg=SignUp Successfull";
			RequestDispatcher dispatcher = req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);
		} else {
			String url = "./signup-page?signupErrMsg=SignUp UnSuccessfull";
			RequestDispatcher dispatcher = req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);
		}
		log.info("afterempSave" + empSave);

	}
}
