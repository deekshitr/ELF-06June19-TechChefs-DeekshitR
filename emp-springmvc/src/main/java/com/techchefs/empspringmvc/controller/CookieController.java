package com.techchefs.empspringmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {
	
	@GetMapping("/getCookiePage")
	public String getCookiepage() {
		return "cookiePage";
	}
	
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse httpResp, ModelMap modelMap) {
		Cookie cookie = new Cookie("name", "sampleCookie");
		httpResp.addCookie(cookie);
		modelMap.addAttribute("msg", "Cookie added successfully");
		return "cookiePage";
		
	}
	
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name = "name") String name, ModelMap modelMap) {
		modelMap.addAttribute("msg",name);
		return "cookiePage";
	}
}
