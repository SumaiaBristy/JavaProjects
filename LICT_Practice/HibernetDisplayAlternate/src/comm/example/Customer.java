package comm.example;

import java.io.Serializable;

public class Customer implements Serializable {
private int id;
private String firstname;
private String lastname;
private Float amount;
public Customer() {
	super();
}
public Customer(int id, String firstname, String lastname, Float amount) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.amount = amount;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Float getAmount() {
	return amount;
}
public void setAmount(Float amount) {
	this.amount = amount;
}





}
