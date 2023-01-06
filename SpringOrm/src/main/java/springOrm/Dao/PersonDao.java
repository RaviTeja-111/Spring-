package springOrm.Dao;

import java.util.List;


import springOrm.Entities.Person;

public interface PersonDao {
	
	public int createPerson(Person person);
	public Person readPerson(int id);
	public int updatePerson();
	public int deletePerson(int id);
	public List<Person> readPersons();
}
