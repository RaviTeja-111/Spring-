package springJdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springJdbc.Entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student student = new Student();
		student.setsId(rs.getInt(1));
		student.setsName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
