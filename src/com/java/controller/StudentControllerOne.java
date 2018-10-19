package com.java.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentControllerOne {
	@RequestMapping("/add")
	public ModelAndView doWork(Authentication auth){
		ModelAndView mv = new ModelAndView("addStudent");
		System.out.println(auth.getAuthorities());
		return mv;
	}

}
