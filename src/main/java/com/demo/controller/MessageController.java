package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	
	@GetMapping("/welcome")
	public String getMsg(Model model) {
		
		model.addAttribute("msg","Welcome to Thymleaf");
		
		return "index";
	}
}
