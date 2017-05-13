package comm.example;

public class Address {
	private int laneno;
	private String city;
	private String country;
	public Address() {
		super();
	}
	public Address(int laneno, String city, String country) {
		super();
		this.laneno = laneno;
		this.city = city;
		this.country = country;
	}
	protected int getLaneno() {
		return laneno;
	}
	protected void setLaneno(int laneno) {
		this.laneno = laneno;
	}
	protected String getCity() {
		return city;
	}
	protected void setCity(String city) {
		this.city = city;
	}
	protected String getCountry() {
		return country;
	}
	protected void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() { //toString is alwys open to object
		// TODO Auto-generated method stub
		return "laneno: "+getLaneno()+" City: "+getCity()+" country: "+getCountry();
	}
	
	

}
