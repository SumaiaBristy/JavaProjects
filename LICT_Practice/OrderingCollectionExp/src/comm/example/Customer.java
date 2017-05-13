package comm.example;

public class Customer implements Comparable {
	private String name;
	private int amount;
	

	public Customer() {
		super();
	}


	public Customer(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Customer c=(Customer) o;
		int value=this.getAmount() -c.getAmount();
		if(value==0)
		return 0;
		else if(value<0)
			return -1;
		else return 1;
	}

	
}
