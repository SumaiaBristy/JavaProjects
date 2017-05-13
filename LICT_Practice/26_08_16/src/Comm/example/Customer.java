package Comm.example;

public class Customer {
	
	private String customerId;
	private String customerName;
	public Customer(String customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void displayCustomer(Customer customer) 
			throws NullPointerException
			{
		
		System.out.print("ID: "+getCustomerId()+" "+"name: "+getCustomerName());
		
			}

}
