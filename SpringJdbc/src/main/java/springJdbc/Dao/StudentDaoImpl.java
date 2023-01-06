package springJdbc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.*;

import springJdbc.Entities.Student;

@Component("stdDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdtemp;

	public JdbcTemplate getJdtemp() {
		return jdtemp;
	}

	public void setJdtemp(JdbcTemplate jdtemp) {
		this.jdtemp = jdtemp;
	}

	public void createStudentTable() {

		jdtemp.execute("create table Student (id number(11),name varchar2(20), city varchar2(25))");
	}

	public int insertStudent(Student student) {
		int i = jdtemp.update("insert into student(id,name,city) values(?,?,?)", student.getsId(), student.getsName(),
				student.getCity());
		return i;
	}

	public int deleteStudent(int id) {
		int d = jdtemp.update("delete from student where id =?", id);
		return d;
	}

	public int updateStudent(Student st) {

		int u = jdtemp.update("update Student set name=?,city=? where id=?",st.getsName(),
				st.getCity(), st.getsId());
		return u;
	}

	public Student retriveStudent(int id) { 

		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = jdtemp.queryForObject("select * from student where id=?", rowMapper, id);

		return student;
	}

	public List<Student> diaplayAll() {

		List<Student> students = jdtemp.query("select * from student", new RowMapperImpl());
		return students;
	}

}
