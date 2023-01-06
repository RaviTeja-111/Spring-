package springJdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springJdbc.Config.JavaConfig;
import springJdbc.Dao.StudentDao;
import springJdbc.Dao.StudentDaoImpl;
import springJdbc.Entities.Student;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext("springJdbc/config.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println("Application Started...");
		while (true) {

			System.out.println("Enter Your Option");
			System.out.println("Press 1 to insert Student record");
			System.out.println("Press 2 to delete Student record ");
			System.out.println("Press 3 to select single Student");
			System.out.println("Press 4 to display all Students");
			System.out.println("Press 5 to update Student");
			System.out.println("Press 6 to Exit");
			StudentDao std = ctx.getBean("stdDao", StudentDaoImpl.class);

			int choice = sc.nextInt();

			if (choice > 0 && choice <= 6) {

				switch (choice) {
				case 1:
					System.out.print("id- ");
					int id = sc.nextInt();
					System.out.print("name- ");
					String name = sc.next();
					System.out.print("city- ");
					String city = sc.next();
					Student st1 = new Student(id,name,city);
					int i = std.insertStudent(st1);
					System.out.println(i + " record inserted");
					break;
				case 2:
					System.out.print("id- ");
					int did = sc.nextInt();

					int d = std.deleteStudent(did);
					System.out.println(d + " record inserted");
					break;
				case 3:
					
					System.out.print("id- ");
					int sid = sc.nextInt();
					Student st3 =std.retriveStudent(sid);
					System.out.println(st3.getsId()+" "+st3.getsName()+" "+st3.getCity());
					break;
				case 4:
					List<Student> studs=std.diaplayAll();
					for(Student s : studs) { 
						System.out.println(s);
					}
					break;
				case 5:
					System.out.print("id you want to change- ");
					int uid = sc.nextInt();
					System.out.print("name- ");
					String uname = sc.next();
					System.out.print("city- ");
					String ucity = sc.next();
		 			Student st5 = new Student();
					st5.setsId(uid);st5.setsName(uname);st5.setCity(ucity);
					int u = std.updateStudent(st5);
					System.out.println(u + " record updated");
					break;
				case 6:
					System.out.println("Thanks for Using this app...");
					System.exit(1);
					break;
				default:
					break;
				}

			} else {
				System.out.println("Invalid choice");
			}

		}
	}
}
