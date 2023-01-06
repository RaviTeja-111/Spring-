package springWeb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springWeb.Model.Person;
import springWeb.Repo.PersonRepo;

@Service
public class PersonService1 {

	@Autowired
	private PersonRepo perRepo;

	
	public int savePerson(Person person) {

		System.out.println("Service...");
		int id = perRepo.createPerson(person);

		return id;
	}

}
