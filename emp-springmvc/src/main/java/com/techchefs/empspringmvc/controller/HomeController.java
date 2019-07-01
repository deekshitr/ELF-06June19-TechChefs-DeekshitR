package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;
import com.techchefs.empspringmvc.dao.EmployeeDAO;
import com.techchefs.empspringmvc.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/employee-portal")
@PropertySource("classpath:constant.properties")
public class HomeController {
	
	@GetMapping("/validate/{url}")
	public String validateSession(HttpSession httpSession, ModelMap modelMap,
			@PathVariable("url") String url, @Value(value = "${loginSessionErrorMsg}") String sessionErrMsg) {
		if (httpSession.isNew()) {
			modelMap.addAttribute("loginErrMsg", sessionErrMsg);
			httpSession.invalidate();
			return "login";
		}
			return "forward:/employee-portal/"+url;
	}
	
	@GetMapping("/validate1")
	public String validateSession1(HttpSession httpSession, ModelMap modelMap,
			@RequestParam String url, @Value(value = "${loginSessionErrorMsg}") String sessionErrMsg) {
		if (httpSession.isNew()) {
			modelMap.addAttribute("loginErrMsg", sessionErrMsg);
			httpSession.invalidate();
			return "login";
		}
			return "forward:/employee-portal/"+url;
	}
	
	@GetMapping("/validate2")
	public String validateSession2(HttpServletRequest req, ModelMap modelMap,
			@RequestParam String url, @Value(value = "${loginSessionErrorMsg}") String sessionErrMsg) {
		if (req.getSession(false) == null) {
			modelMap.addAttribute("loginErrMsg", sessionErrMsg);
		}
		
		return "login";
	}
	
	@GetMapping("/searchemp")
	public String searchEmployee(@RequestParam String empSearch, HttpSession httpSession) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean empInfo = dao.getEmployeeInfo(empSearch);
		httpSession.setAttribute("empInfo", empInfo);
		
		return "home";
	}
	
}
