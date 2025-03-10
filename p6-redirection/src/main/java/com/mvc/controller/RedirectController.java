package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	// 1- by prifix........	
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is one handler");
//		return "redirect:/second";
//	}
//	
//	@RequestMapping("/second")
//	public String second() {
//		System.out.println("Second Method....");
//		return "home";
//	}
	
	// 2- by RedirectView........
	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("second");
		return redirectView;
	}
	
	@RequestMapping("/second")
	public String second() {
		System.out.println("Second Method....");
		return "home";
	}
	
}
