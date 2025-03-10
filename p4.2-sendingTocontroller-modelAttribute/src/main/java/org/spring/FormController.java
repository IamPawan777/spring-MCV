package org.spring;

import org.spring.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	@ModelAttribute							// as a common data/model for hole application
	public void commonData(Model model) {
		model.addAttribute("Header", "Registration Form");
		model.addAttribute("Desc", "Fill form before 30 minitus.");
	}
	
	@RequestMapping("/form")
	public String showForm() {	
		return "form";
	}
	
	@RequestMapping(path = "/sending", method = RequestMethod.POST)
//	public String handleForm(@ModelAttribute User user, @RequestParam("check") String ck) {					// requestParam  vs  ModelAttribute together
	public String handleForm(@ModelAttribute User user) {
		System.out.println(user);
//		System.out.println("Check Box :"+ck);
		return "success";
	}
	
//....OR..........	
	
	/*public String handleForm(
			@RequestParam(name =  "username", required = true) String u_name, 
			@RequestParam("email") String u_email, 
			@RequestParam("password") String u_pass,
			Model model) {
		
		User user = new User();
		user.setUsername(u_name);
		user.setEmail(u_email);
		user.setPassword(u_pass);
		
		System.out.println(user);			// consol print
		
		model.addAttribute(user);			// to view
		return "success";
	}*/
	
	
}
