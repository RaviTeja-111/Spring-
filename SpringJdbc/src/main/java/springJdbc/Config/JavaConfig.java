package springJdbc.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages="springJdbc.Dao")
public class JavaConfig {
	
	@Bean(name={"ds"})
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("raviteja");
		ds.setPassword("kommuri");
		return ds;
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getTemplate() {
	
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}
	/*	
	 * If we use @Component and ConpnentScan then no need for this bean creating just autowire template
	@Bean("stdDao")
	public StudentDao getStudent() {
		
		StudentDaoImpl stdao = new StudentDaoImpl();
		stdao.setJdtemp(getTemplate());
		return stdao;
	} */

}
