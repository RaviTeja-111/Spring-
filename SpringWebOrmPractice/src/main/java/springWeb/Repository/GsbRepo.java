package springWeb.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springWeb.Model.GurusthanBooks;

@Repository
public class GsbRepo {

	@Autowired
	private HibernateTemplate hibTemp;

	@Transactional
	public int saveBook(GurusthanBooks gb) {

		int id = (int) hibTemp.save(gb);
		return id;
	}

}
