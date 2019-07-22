package com.techchefs.empspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping(path="/getMessage", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("messagePage.jsp");
		return modelAndView;
		
	}
	
	@RequestMapping(path="/seeMessage", method = RequestMethod.GET)
	public ModelAndView seeMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("messagePage.jsp");
		return modelAndView;
		
	}

}
