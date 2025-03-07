package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/home")
	public String showHome() {
		return "home";
	}
	
	
	@RequestMapping("/welcome")
	public String handleHome(@RequestParam("username") String user, Model model) {
		model.addAttribute("msg", user);
		return "homeData";
	}

}
