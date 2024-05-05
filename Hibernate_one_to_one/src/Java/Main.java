package Java;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setEemail("dfg");
	e.setEname("sdf");
	
	Employee e1=new Employee();
	e1.setEemail("reqwfgthyre");
	e1.setEname("2e	qrtyuiytfsd");
	
	Employee e3=new Employee();
	e3.setEemail("qweftryuiyoturgwqerh");
	e3.setEname("werghjum4g5wedfghjkyiuytstryklkj");
	
	Address a=new Address();
	a.setCountry("sdf");
	a.setState("sdfr");
	
 List<Employee> al=new ArrayList<>();
 al.add(e);
 al.add(e3);
 al.add(e1);
 
 a.setAl(al);
 SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session= sessionFactory.openSession();
	session.beginTransaction();
	session.save(a);
	session.save(e);
	session.save(e1);
	session.save(e3);
	session.getTransaction().commit();
	session.close();


}
}
