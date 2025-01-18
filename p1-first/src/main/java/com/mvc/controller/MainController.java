package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/home")						// browser url name
	public String home() {
		System.out.println("home url.....");
		return "home";								// web page name
	}
	
	@RequestMapping("/abt")
	public String about() {
		System.out.println("About url......");
		return "about";
	}
}
