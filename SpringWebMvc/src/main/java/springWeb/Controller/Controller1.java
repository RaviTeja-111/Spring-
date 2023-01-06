package springWeb.Controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {

	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("Header","This common data to display in all pages using ModelAttribute");
	}
	
	@RequestMapping("/page1")
	public String page1() {

		return "page1";
	}

	@ResponseBody
	@RequestMapping("/dummy")
	public String dummy() {

		return "<h2>This is a blank page i.e not using any tags in this page i.e using @ResponseBody</h2>";
	}
	
	@RequestMapping("/model1")
	public String model(Model m) {
		int id = 101;
		
		m.addAttribute("id",id);
		m.addAttribute("name","RaviTeja");
		
		return "model1";
	}
	
	@RequestMapping("/model2")
	public ModelAndView modelandview(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 111);
		mv.addObject("name","kommuri");
		
		mv.addObject("content","With Jstl we can directly use key and get its value");
		
		List<Object> li = new ArrayList<>();
		li.add("RaviTeja");
		li.add("Kommuri");
		li.add(91218515);
		mv.addObject("details", li);
		mv.setViewName("model2");
		return mv;
		
	}
}
