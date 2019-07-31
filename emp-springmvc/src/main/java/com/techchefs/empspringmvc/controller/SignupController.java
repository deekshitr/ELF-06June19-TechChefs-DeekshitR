package com.techchefs.empspringmvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;
import com.techchefs.empspringmvc.dao.EmployeeDAO;
import com.techchefs.empspringmvc.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/")
public class SignupController {
	
	@GetMapping("/signup-form")
	public String getSignForm() {
		return "signup";
	}
	
	@PostMapping("/createemployee")
	public String signup(EmployeeInfoBean employeeInfoBean, ModelMap modelMap) {
		
		log.info("employeeInfoBean"+employeeInfoBean);
		
//		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
//		boolean empSave = dao.createEmployeeInfo(employeeInfoBean);
		
		return "signup";
	
	}
	
}
