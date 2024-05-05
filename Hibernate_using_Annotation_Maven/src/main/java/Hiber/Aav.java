package Hiber;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Aav {
@Id
private int id;
private String Name;
private int age;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getid() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String Name)
{
	this.Name=Name;
}
}