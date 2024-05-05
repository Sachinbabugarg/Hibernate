package hibernate_embaded;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity

public class EmployeeAddress {

@Override
	public String toString() {
		return "EmployeeAddress [caddress=" + caddress + ", paddress=" + paddress + ", state=" + state
				+ ", getCaddress()=" + getCaddress() + ", getPaddress()=" + getPaddress() + ", getState()=" + getState()
				+ "]";
	}
@Transient
private String caddress;
private String paddress;
private String state;
public String getCaddress() {
	return caddress;
}
public void setCaddress(String caddress) {
	this.caddress = caddress;
}
public String getPaddress() {
	return paddress;
}
public void setPaddress(String paddress) {
	this.paddress = paddress;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

	
}
