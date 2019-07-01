package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techchefs.empspringmvc.dto.UserBean;

@Controller
@RequestMapping("/portal")
public class FormHandlingController {

	@GetMapping("/login-form")
	public String getLoginForm() {
		return "loginForm";
	}

	@PostMapping("/login-submit")
	public String login(HttpServletRequest req) {
		int empId = Integer.parseInt(req.getParameter("userId"));
		String pwd = req.getParameter("password");

		req.setAttribute("userId", empId);
		req.setAttribute("password", pwd);

		return "formDataDisplay";
	}

	@PostMapping("/second-login")
	public String secondLogin(int userId, String password, ModelMap modelMap) {

		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);

		return "formDataDisplay";
	}

	@PostMapping("/third-login")
	public String thirdLogin(UserBean userbean, ModelMap modelMap) {
		modelMap.addAttribute("userbean", userbean);
		return "formDataBeanDisplay";
	}

	@PostMapping("/fourth-login")
	public String fourthLogin(@RequestParam(name = "userId") int uid,
			@RequestParam(name = "password") String pass, ModelMap modelMap) {

		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pass);

		return "formDataDisplay";
	}
	
	@PostMapping("/fifth-login")
	public String fifthLogin(@RequestParam(name = "userId") int uid,
			@RequestParam(name = "password") String pass, ModelMap modelMap) {

		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pass);

		return "formDataDisplayEL";
	}
	
	@PostMapping("/sixth-login")
	public String sixthLogin(UserBean userbean, ModelMap modelMap) {
		modelMap.addAttribute("userbean", userbean);
		return "formDataBeanDisplayEL";
	}
}
