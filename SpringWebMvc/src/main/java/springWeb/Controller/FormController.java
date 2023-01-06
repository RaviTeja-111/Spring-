package springWeb.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springWeb.Model.User;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String form() {

		return "form";
	}
/*
	@RequestMapping("/formDetails")
	public String formViewer(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("city") String city,
			@RequestParam("gender") String gender,
			Model m) {
//		
//		  Object name = req.getAttribute("name"); Object email =
//		  req.getAttribute("email"); Object password = req.getAttribute("password");
//		  Object city = req.getAttribute("city"); Object gender =
//		  req.getAttribute("gender");
		 
		m.addAttribute("name",name);
		m.addAttribute("email",email);
		m.addAttribute("gender",gender);
		m.addAttribute("password",password);
		m.addAttribute("city",city);
		return "dummy";
	}
	*/
	
	
	
	@RequestMapping("/formDetails")
	public String formViewerModelAttri(@ModelAttribute User user) {
		
		System.out.println(user);
		return "formViewer";
	}

}
