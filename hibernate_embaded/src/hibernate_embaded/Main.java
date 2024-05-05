package hibernate_embaded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	/*Employee e=new Employee();
	e.setEid(1);
	e.setFname("Rahul");
	e.setLname("Saxebna");
	
	EmployeeAddress ea=new EmployeeAddress();

	ea.setCaddress("Patna");
	ea.setPaddress("Bhopal");
	ea.setState("Bihar");
	
	e.setAddress(ea);*/
	
   
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	Employee e= session.get(Employee.class,3);
	System.out.println(e.getAddress());
	session.getTransaction().commit();
	session.close();



}
}
