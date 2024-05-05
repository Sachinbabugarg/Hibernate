package Java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_address")
public class Address {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="address_id")
private int id;
private String state;
private String country;

@ManyToOne

@JoinTable(name = "Good", joinColumns = @JoinColumn(name = "address_id"),inverseJoinColumns = @JoinColumn(name="employee_id"))
private List<Employee> al=new ArrayList<Employee>();

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public List<Employee> getAl() {
	return al;
}

public void setAl(List<Employee> al) {
	this.al = al;
}




}
