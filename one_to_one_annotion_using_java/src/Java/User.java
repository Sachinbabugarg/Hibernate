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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="US")
public class User {
@Id
@Column(name="User_id")
private int Uid;

private String Uname;
private String password;

@OneToOne
@JoinColumn(name="Cid")
private Company al;


public Company getAl() {
	return al;
}

public void setAl(Company al) {
	this.al = al;
}

public int getUid() {
	return Uid;
}

public void setUid(int uid) {
	Uid = uid;
}

public String getUname() {
	return Uname;
}

public void setUname(String uname) {
	Uname = uname;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
	
}
}
