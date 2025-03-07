package org.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping("/home")
	public String showHome() {
		return "home";
	}
		
	@RequestMapping("/registerssssss")				
	public String showRegister() {
		return "register";
	}
	

}
