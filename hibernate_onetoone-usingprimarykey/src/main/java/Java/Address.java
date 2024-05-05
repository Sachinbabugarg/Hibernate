package Java;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Address {

@Id
private int id;
private String add;

@OneToOne
@PrimaryKeyJoinColumn(name="id")
private Employee emp;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}

public Employee getEmp() {
	return emp;
}

public void setEmp(Employee emp) {
	this.emp = emp;
}

}
