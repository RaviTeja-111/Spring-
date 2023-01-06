package springWeb.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springWeb.Model.Person;

@Repository
public class PersonRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int createPerson(Person p) {

		System.out.println("Repoo...");
		int id = (int) hibernateTemplate.save(p);
		return id;

	}

}
