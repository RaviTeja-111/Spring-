package springWeb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springWeb.Model.GurusthanBooks;
import springWeb.Service.GsbService;

@Controller
public class GController {
	
	@Autowired
	private GsbService gsbService;

	@RequestMapping("/one")
	public String book() {

		System.out.println("1st Controller");
		return "redirect:/second";
	}

	@RequestMapping("/second")
	public String second() {
		System.out.println("2nd Controller");
		return "redirect:/gurusthanBooks";
	}

	@RequestMapping("/gurusthanBooks")
	public String gurusthanBooks() {

		return "gurusthanBooks";
	}

	@RequestMapping("/book_Details")
	public String bookDetails(@ModelAttribute GurusthanBooks gurusthanBooks)  {
		System.out.println(gurusthanBooks.getBookName());
		int id = gsbService.saveGsb(gurusthanBooks);
		System.out.println(id+" is saved");
		System.out.println("Book Details ");
		return "book_details";
	}
}
