package Java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="school")
public class School {

@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="School_id")
private int Scid;

private String Sname;

private String Saddress;

public int getScid() {
	return Scid;
}

public void setScid(int scid) {
	Scid = scid;
}

public String getSname() {
	return Sname;
}

public void setSname(String sname) {
	Sname = sname;
}

public String getSaddress() {
	return Saddress;
}

public void setSaddress(String saddress) {
	Saddress = saddress;
}



	
	
}
