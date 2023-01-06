package springOrm.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import springOrm.Entities.Person;

public class PersonDaoImpl {

	private HibernateTemplate hibTemp;

	public HibernateTemplate getHibTemp() {
		return hibTemp;
	}

	public void setHibTemp(HibernateTemplate hibTemp) {
		this.hibTemp = hibTemp;
	}

	@Transactional
	public int createPerson(Person person) {

		int i = (Integer) hibTemp.save(person);
		return i;
	}

	public Person readPerson(int id) {

		Person p = hibTemp.get(Person.class, id);
		return p;
	}

	@Transactional
	public void updatePerson(Person person) {

		hibTemp.update(person);
	}

	@Transactional
	public void deletePerson(int id) {

		Person p = hibTemp.get(Person.class, id);
		hibTemp.delete(p);

	}

	public List<Person> readPersons() {

		List<Person> persons = hibTemp.loadAll(Person.class);
		return persons;
	}

}
