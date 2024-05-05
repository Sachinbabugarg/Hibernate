package Java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="COM")
public class Company {

	
@Id
private int Cid;
private String Cname;
private String Caddress;
public int getCid() {
	return Cid;
}
public void setCid(int cid) {
	Cid = cid;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public String getCaddress() {
	return Caddress;
}
public void setCaddress(String caddress) {
	Caddress = caddress;
}

}
