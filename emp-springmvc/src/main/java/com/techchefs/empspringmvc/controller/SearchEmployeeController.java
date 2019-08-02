package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;
import com.techchefs.empspringmvc.common.EMPConstants;
import com.techchefs.empspringmvc.dao.EmployeeDAO;

@Controller
@RequestMapping("/employee-portal")
public class SearchEmployeeController {
	
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@GetMapping("/searchemp")
	public String searchEmployee(@RequestParam String empSearch, HttpSession httpSession,
			@Value(value = "${dbInteractionType}") String dbInteractionType) {
		//EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInteractionType);
		EmployeeInfoBean empInfo = dao.getEmployeeInfo(empSearch);
		httpSession.setAttribute("empInfo", empInfo);
		
		return EMPConstants.VIEW_HOME_PAGE;
	}
}
