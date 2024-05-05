package Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MAin {
public static void main(String[] args) {
	Aav a=new Aav();
	Aav b=new Aav();
	a.setAge(10);
	a.setId(1);
	a.setName("Akk");
	b.setAge(20);
	b.setId(2);
	b.setName("Manish");
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	s.beginTransaction();
	s.save(a);
	s.save(b);
	s.getTransaction().commit();
	s.close();

}
}
