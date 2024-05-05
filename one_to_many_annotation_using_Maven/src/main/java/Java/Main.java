package Java;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	
	School s1=new School();
	School s2=new School();
	School s3=new School();
	
	Studdent s=new Studdent();
	s1.setSaddress("Prem bihar colony gali no.3");
	s1.setSname("Bihar");
	s2.setSaddress("panna");
	s2.setSname("saraswati");
	s3.setSaddress("Satna");
	s3.setSname("Venkat");
	
	s.setScity("Ahmadabad");
	s.setSname("Alok");
	
	ArrayList<School> list=new ArrayList<School>();
   s.setAl(list);
   SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	session.save(s1);
	session.save(s);
	session.save(s2);
	session.save(s3);
	session.getTransaction().commit();
	session.close();
   
   
   
   
}
}
