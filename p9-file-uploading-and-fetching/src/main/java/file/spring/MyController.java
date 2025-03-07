package file.spring;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	
	@RequestMapping("/fileUpload")
	public String showFileUpload() {
		return "fileUpload";
	}
		
	@PostMapping(path = "/uploadimage")
	public String handleFileUpload(@RequestParam("images") MultipartFile file, HttpSession session, Model model){
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getName());
		
		try {			
			byte[] data = file.getBytes();			
			String path = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
			System.out.println(path);
			
			FileOutputStream fos = new FileOutputStream(path);			// object to actual stream
			fos.write(data);
			fos.close();
			System.out.println("File Uploaded....");
			
			model.addAttribute("msg", "Upload successFully !");
			model.addAttribute("filename", file.getOriginalFilename());
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("File uploading error.......");
			model.addAttribute("msg", "Uploading Error !");
		}
		return "success";
	}
	
}
