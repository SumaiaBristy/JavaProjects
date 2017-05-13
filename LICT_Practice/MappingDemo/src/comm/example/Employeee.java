package comm.example;

import java.io.Serializable;

public class Employeee implements Serializable {
	
	protected int id;
	protected String name;
	
	public Employeee() {
		super();
	}


	public Employeee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


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
	
	
	

}
