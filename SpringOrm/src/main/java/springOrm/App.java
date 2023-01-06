package springOrm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springOrm.Dao.PersonDao;
import springOrm.Dao.PersonDaoImpl;
import springOrm.Entities.Person;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springOrm/Config/config.xml");
		System.out.println("Applicatioin Started...");
		// im not using interface bcz BeanNotOfRequiredType Exception arisers
		PersonDaoImpl pd = ctx.getBean("persondao", PersonDaoImpl.class);

		while (true) {
			System.out.println("Press 1 to insert Person record");
			System.out.println("Press 2 to read Person record");
			System.out.println("Press 3 to update Person record");
			System.out.println("Press 4 to delete Person record");
			System.out.println("Press 5 to display all Person record");
			System.out.println("Press 6 to exit\n");

			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			if (choice < 0 && choice > 6) {
				System.out.println("Enter valid input");
			} else {
				switch (choice) {
				case 1:
					System.out.print("Enter Person id - ");
					int id = sc.nextInt();
					System.out.print("Enter Person Name - ");
					String name = sc.next();
					System.out.print("Enter Person age - ");
					int age = sc.nextInt();
					System.out.print("Enter Person Ph.Num - ");
					long phno = sc.nextLong();
					Person p1 = new Person();
					p1.setpId(id);
					p1.setpName(name);
					p1.setAge(age);
					p1.setPhNo(phno);
					int i = pd.createPerson(p1);
					System.out.println(i + " id inserted");
					break;
				case 2:
					System.out.println("Enter the person Id to display :");

					int rid = sc.nextInt();
				
					Person p2 = pd.readPerson(rid);
					System.out.println(p2.getpId() + " " + p2.getpName() + " " + p2.getAge() + " " + p2.getPhNo());

					break;
				case 3:
					System.out.println("Enter the id of existing Person");
					int uid = sc.nextInt();
					System.out.println("Enter the name ");
					String uName = sc.next();
					System.out.println("Enter the age of the person");
					int uage = sc.nextInt();
					System.out.println("Enter the phno");
					long phNo = sc.nextLong();
					Person p3 = new Person();
					p3.setpId(uid);
					p3.setpName(uName);
					p3.setAge(uage);
					p3.setPhNo(phNo);
					pd.updatePerson(p3);
					System.out.println("Record updated..");
					break;
				case 4:
					System.out.println("Enter the id you want to delete");

					int dId = sc.nextInt();
					pd.deletePerson(dId);
					System.out.println(dId + " deleted");
					break;
				case 5:
					System.out.println("All the person Details are...");
					List<Person> p5 = pd.readPersons();
					for (Person p : p5) {
						System.out.println(p);
					}
					break;
				case 6:

					System.exit(123456);
					System.out.println("Thank you for using this app..\n Visit us again");
					break;
				}
			}
		}

	}
}
