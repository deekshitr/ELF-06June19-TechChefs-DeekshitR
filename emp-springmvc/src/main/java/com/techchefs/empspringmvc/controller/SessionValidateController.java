package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.empspringmvc.common.EMPConstants;

@Controller
@RequestMapping("/employee-portal")
public class SessionValidateController {
	
	@GetMapping("/validate/{url}")
	public String getValidateSession(HttpSession httpSession, ModelMap modelMap,
			@PathVariable("url") String url, @Value(value = "${loginSessionErrorMsg}") String sessionErrMsg) {
		if (httpSession.isNew()) {
			modelMap.addAttribute("loginErrMsg", sessionErrMsg);
			httpSession.invalidate();
			return "redirect:/employee-portal/login-form";
		}
			return "forward:/employee-portal/"+url;
	}
	
	@PostMapping("/validate/{url}")
	public String postValidateSession(HttpSession httpSession, ModelMap modelMap,
			@PathVariable("url") String url, @Value(value = "${loginSessionErrorMsg}") String sessionErrMsg) {
		if (httpSession.isNew()) {
			modelMap.addAttribute("loginErrMsg", sessionErrMsg);
			httpSession.invalidate();
			return "redirect:/employee-portal/login-form";
		}
			return "forward:/employee-portal/"+url;
	}
}
