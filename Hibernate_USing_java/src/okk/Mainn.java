

package okk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mainn {
public static void main(String[] args) {
	 emploo h=new emploo();
	 //duplicate not allow because primary key id
	 h.setId(134);
	 h.setName("Alok");
	 h.setAge(10);
	 h.setId(190);
	 h.setName("Aadmi");
	 h.setAge(45);
	 
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	s.beginTransaction();
	s.save(h);
	s.getTransaction().commit();
	s.close();
}
}
