package comm.example;

public class Customer {
	
	private int id;
	private String firstname;
	private String lastname;
	private double amount;
	
	

	public Customer() {
		super();
	}


	public Customer(int id, String firstname, String lastname, double amount) {
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


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


}
