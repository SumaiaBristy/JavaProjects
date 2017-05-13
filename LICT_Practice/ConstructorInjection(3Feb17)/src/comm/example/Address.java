package comm.example;

public class Address {
	private String laneNo;
	private String city;
	private String phoneNo;
	/*public Address() {
		super();
	}
	public Address(String laneNo, String city, String phoneNo) {
		super();
		this.laneNo = laneNo;
		this.city = city;
		this.phoneNo = phoneNo;
	}*/
	
	
	
	@Override
	public String toString() { //tostring override na kr
		// TODO Auto-generated method stub
		return "Lane no: "+laneNo+" City :"+city+" phonenno: "+phoneNo;
	}



	public String getLaneNo() {
		return laneNo;
	}



	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	

}
