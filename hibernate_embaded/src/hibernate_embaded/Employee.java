package hibernate_embaded;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int eid;
private String fname;
private String lname;

@Embedded
EmployeeAddress address;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public EmployeeAddress getAddress() {
	return address;
}
public void setAddress(EmployeeAddress address) {
	this.address = address;
}

}
