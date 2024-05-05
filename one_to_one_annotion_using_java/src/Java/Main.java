package Java;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	User u=new User();
	
	u.setUid(3);  
	u.setUname("Ahmad");
	u.setPassword("Sachin@1");
	
	Company c1=new Company();
	c1.setCid(4);
    c1.setCaddress("Satna prem bihar colony gali no. 3");
    c1.setCid(101);
    c1.setCname("Wipro");
    
    
    u.setAl(c1);
    
   SessionFactory sf=new Configuration().configure().buildSessionFactory();
   Session s=sf.openSession();
   s.beginTransaction();
   s.save(u);
   s.save(c1);
   s.getTransaction().commit();
   s.close();
}
}
