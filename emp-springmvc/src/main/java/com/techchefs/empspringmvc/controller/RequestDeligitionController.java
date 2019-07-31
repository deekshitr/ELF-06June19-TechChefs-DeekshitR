package com.techchefs.empspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deligate")
public class RequestDeligitionController {
	
	@GetMapping("/getHomePage")
	public String getHomePage() {
		return "homePage";
	}
	
	@GetMapping("/forwordReq")
	public String forwardReq() {
		return "forward:/portal/login-form";
	}
	
	@GetMapping("/redirectReq")
	public String redirectReq() {
		return "redirect:/portal/login-form";
	}
}
