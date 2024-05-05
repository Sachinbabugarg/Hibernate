package Java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {

	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="employee_id")
private int id;
private String ename;
private String eemail;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEemail() {
	return eemail;
}
public void setEemail(String eemail) {
	this.eemail = eemail;
}



}
