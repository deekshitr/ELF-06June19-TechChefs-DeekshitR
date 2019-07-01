package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee-portal")
public class LogoutController {

	@GetMapping("/logout")
	public String logout(HttpSession httpSession, ModelMap modelMap) {

		// Invalidate the session
		httpSession.invalidate();
		modelMap.addAttribute("logoutSuccessMsg", "Thank you for visiting");
		
		return "login";

	}
}
