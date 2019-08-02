package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.empspringmvc.common.EMPConstants;

@Controller
@RequestMapping("/employee-portal")
public class LogoutController {

	@GetMapping("/logout")
	public String logout(HttpSession httpSession, ModelMap modelMap,
			@Value(value = "${logoutSuccessMsg}") String logoutSuccessMsg) {

		// Invalidate the session
		httpSession.invalidate();
		modelMap.addAttribute("logoutSuccessMsg", logoutSuccessMsg);
		
		return "redirect:/employee-portal/login-form";

	}
}
