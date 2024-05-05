package Java;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	One o=new One();
	One o1=new One();
	o.setId(1);
	o.setRollro("0111Ec");
	o.setName("Sanat");
	o.setSalary(1200.3);
	o1.setId(2);
	o1.setRollro("0111Ec19");
	o1.setName("Ahamd");
	o1.setSalary(111238.4);
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	s.beginTransaction();
	s.save(o);
	s.save(o1);
	s.getTransaction().commit();
	s.close();
}
}
