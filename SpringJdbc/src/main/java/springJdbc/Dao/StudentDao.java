package springJdbc.Dao;

import java.util.List;

import springJdbc.Entities.Student;

public interface StudentDao {

	public void createStudentTable();
	public int insertStudent(Student student);
	public int deleteStudent(int id) ;
	public int updateStudent(Student student);
	public Student retriveStudent(int id);
	public List<Student> diaplayAll();
	
}
