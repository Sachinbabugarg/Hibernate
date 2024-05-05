package Java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MAin {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setName("Alok");
	Address a=new Address();
	a.setId(1);
	a.setAdd("jhg");
	a.setEmp(e);
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	session.save(e);
    session.save(a);
	session.getTransaction().commit();
	session.close();
	
}
}
