package file.handing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/first")
	public String showFirst() {
		// processing............
		String str = null;
		System.out.println(str.length());
		return "first";
	}

	
// here only this class exception handles..........
	
//// handing exception..
//	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//	public String exceptionHanding(Model model) {
//		model.addAttribute("msg", "Error message from controller");
//		return "errorPage";
//	}
//	
//// generic..
//	@ExceptionHandler(value= Exception.class)
//	public String allExceptionHanding(Model model) {
//		model.addAttribute("msg", "All exception");
//		return "errorPage";
//	}
	
	
}