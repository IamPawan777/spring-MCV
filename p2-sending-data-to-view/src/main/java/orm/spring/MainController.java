package orm.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	// Model........
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Pawan Bisht");
		model.addAttribute("num", 2130102);
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Krishna");
		list.add("Sita");
		list.add("RRR");
		model.addAttribute("frients", list);				// collection without " "
		
		return ("home");
	}
	
	// ModelAndView......
	@RequestMapping("/description")
	public ModelAndView descriptionPage() {
		ModelAndView model = new ModelAndView();
		
		model.addObject("name", "Lokesh");
		List<String> list = new ArrayList<>();
		list.add("CPP");
		list.add("Java");
		list.add("Python");
		model.addObject("course", list);
		
		model.setViewName("description");			// .jsp page name
		return model;
	}
}
