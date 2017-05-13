package Comm.example;

public class Employee {
	
	String FirstName;
	String LastName;
	int Id;
	
	
	public Employee() {
		super();
	}


	public Employee(String firstName, String lastName, int id) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		//return "Exception occured: "+message;
	}
	
	
	
	

}
