package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/log")
	public String loginCheck()
	{
		System.out.println("hello");
		return "success";
		
	
		
	}
}
