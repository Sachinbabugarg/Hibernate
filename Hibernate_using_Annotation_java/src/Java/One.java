package Java;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class One {
@Id
private int id; 
private String name;
private double Salary;
private String rollro;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
public String getRollro() {
	return rollro;
}
public void setRollro(String rollro) {
	this.rollro = rollro;
}
}
