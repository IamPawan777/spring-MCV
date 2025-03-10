package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.entity.User;

@Controller
public class MainController {
		
		@ModelAttribute
		public void commonData(Model model) {
			model.addAttribute("Header", "Registration Page...");
			model.addAttribute("desc", "Enjoy and fill");
		}
	
		@RequestMapping("/home")
		public String showForm() {
			return "home";
		}
		
		@RequestMapping(path = "sending", method = RequestMethod.POST)
		public String homePage(@ModelAttribute User user) {
			System.out.println(user);
			return "output";
		}
}
