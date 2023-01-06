package springWeb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springWeb.Model.GurusthanBooks;
import springWeb.Repository.*;

@Service
public class GsbService {

	@Autowired
	private GsbRepo gsbRepo;

	public int saveGsb(GurusthanBooks gb) {

		int id = gsbRepo.saveBook(gb);
		return id;
	}
}
