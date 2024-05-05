package Sachin;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Mainn {
public static void main(String[] args) {
	Hiber h=new Hiber();
	Hiber h1=new Hiber();
	//duplicate value not allow because id is primary key
	h.setId(35);
	h.setName("Sachin");
	h.setAge(10);
	h1.setId(101);
	h1.setName("GOOd");
	h1.setAge(109);
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	s.beginTransaction();
	s.save(h);
	s.save(h1);
	s.getTransaction().commit();
	s.close();
}
}
