package file.handing;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {
	
	@ExceptionHandler(NullPointerException.class)
	public String nullPointer(Model model) {
		model.addAttribute("msg", "Null Pointer Exception from controller");
		return "errorPage";
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public String numberFormat(Model model) {
		model.addAttribute("msg", "Number Formate Exception from controller");
		return "errorPage";
	}

	@ExceptionHandler(value = Exception.class)			// all kind of  exception
	public String allExceptionHanding(Model model) {
		model.addAttribute("msg", "All exception");
		return "errorPage";
	}
}
