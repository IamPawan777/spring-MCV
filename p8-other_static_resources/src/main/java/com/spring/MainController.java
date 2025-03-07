package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String showHome() {
		return "home";
	}
	
	@RequestMapping(path = "/googleProcess", method = RequestMethod.POST)
	public RedirectView processForm(@RequestParam("googleQueryBox") String query) {
		
		RedirectView redirectView = new RedirectView();
		String url = "https://www.google.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
}
