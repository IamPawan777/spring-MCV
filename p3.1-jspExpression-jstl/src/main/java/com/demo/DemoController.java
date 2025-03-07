package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		model.addObject("name", "Komal Bisht");
		model.addObject("num", 2130102);
		
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Krishna");
		list.add("Sita");
		list.add("Radha");
		
		model.addObject("frients", list);				// collection without " "
		model.setViewName("home");
		
		return model;
	}
		
}
