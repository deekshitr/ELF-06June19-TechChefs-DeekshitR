package com.techchefs.empspringmvc.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;
import com.techchefs.empspringmvc.dao.EmployeeDAO;
import com.techchefs.empspringmvc.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/")
public class SignupController {
	
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@GetMapping("/signup-form")
	public String getSignForm() {
		return "signup";
	}
	
	@PostMapping("/createemployee")
	public String signup(EmployeeInfoBean employeeInfoBean, ModelMap modelMap,
			@Value(value = "${dbInteractionType}") String dbInteractionType) {
		
		log.info("employeeInfoBean"+employeeInfoBean);
		//EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInteractionType);
		boolean empSave = dao.createEmployeeInfo(employeeInfoBean);
		log.info("empSave" + empSave); 
		if (empSave) {
			modelMap.addAttribute("signupSuccessMsg", "SignUp SuccessFull");
		} else {
			modelMap.addAttribute("signupErrMsg", "SignUp UnSuccessFull");
		}
		return "signup";
	
	}
	
}
