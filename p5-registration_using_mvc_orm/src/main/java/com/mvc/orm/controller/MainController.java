package com.mvc.orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.orm.entity.User;
import com.mvc.orm.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@ModelAttribute
	public void commonModel(Model model) {
		model.addAttribute("Header", "Student Data");
		model.addAttribute("Desc", "Copyright Student Data");
	}
	
	@RequestMapping(path = "/sending", method = RequestMethod.POST )
	public String formPage(@ModelAttribute User us, Model model) {
		
		int id = userService.createUser(us);			// service
		model.addAttribute("msg", "User created id: "+id);
		return "successfully";
	}
}
