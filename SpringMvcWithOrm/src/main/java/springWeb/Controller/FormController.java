package springWeb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springWeb.Model.Person;
import springWeb.Service.PersonService1;

@Controller
public class FormController {
	
	@Autowired
	private PersonService1 perService; 
	
	@RequestMapping("/form")
	public String form() {
		
		return "form";
	}
	
	@RequestMapping("/formDetails")
	public String formReceiver(@ModelAttribute Person person,Model m) {
		
		perService.savePerson(person);
		return"formDetails";
	}

	public PersonService1 getPerService() {
		return perService;
	}

	public void setPerService(PersonService1 perService) {
		this.perService = perService;
	}

}
