package comm.example;

import java.io.Serializable;

public class Contract_Employee extends Employeee implements Serializable {
	  private int pay_per_hour;  
	  private String contract_duration;
	public Contract_Employee() {
		super();
	}
	public Contract_Employee(int id,String name,int pay_per_hour, String contract_duration) {
		super();
		this.id=id;
		this.name=name;
		this.pay_per_hour = pay_per_hour;
		this.contract_duration = contract_duration;
	}
	public int getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	
	

}
