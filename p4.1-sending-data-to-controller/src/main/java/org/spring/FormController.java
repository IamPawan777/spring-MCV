package org.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam(name =  "username", required = true) String u_name, 
			@RequestParam("email") String u_email, 
			@RequestParam("password") String u_pass,
			Model model) {
		System.out.println("user name: "+u_name);
		System.out.println("user Email: "+u_email);
		System.out.println("user Password: "+u_pass);
		
		
		// ----------processing something------------
	
		
		model.addAttribute("name", u_name);
		model.addAttribute("email", u_email);
		model.addAttribute("pass", u_pass);
		return "success";
	}
}
