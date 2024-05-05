package Java;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {

	user u1=new user();
	address a1=new address();
	
	u1.setName("Second");
	u1.setEmail("@12345gmail.com");
	a1.setCity("BHopal");
	a1.setCountry("India");
	a1.setPincode(485);
	a1.setState("Maharastra");

	u1.setAl(a1);
	
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	session.save(u1);
	session.save(a1);
	session.getTransaction().commit();
	session.close();
}
}