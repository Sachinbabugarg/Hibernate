package Java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Studdent {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="Student_id")
private int Sid;
private String Sname;
private String Scity;

@OneToMany(cascade = CascadeType.ALL)
@JoinTable(name = "SCHOOL_AND_STUDENT", joinColumns = @JoinColumn(name = "Student_id"),inverseJoinColumns = @JoinColumn(name="School_id"))
private List<School> al=new ArrayList<School>();

public int getSid() {
	return Sid;
}

public void setSid(int sid) {
	Sid = sid;
}

public String getSname() {
	return Sname;
}

public void setSname(String sname) {
	Sname = sname;
}

public String getScity() {
	return Scity;
}

public void setScity(String scity) {
	Scity = scity;
}

public List<School> getAl() {
	return al;
}

public void setAl(List<School> al) {
	this.al = al;
}


}
