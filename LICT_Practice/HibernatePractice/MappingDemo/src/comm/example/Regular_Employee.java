package comm.example;

import java.io.Serializable;

public class Regular_Employee extends Employeee implements Serializable {
	
	private float salary;
	private float bonus;
	public Regular_Employee() {
		super();
	}
	public Regular_Employee(int id,String name,float salary, float bonus) {
		super();
		this.id=id;
		this.name=name;
		this.salary = salary;
		this.bonus = bonus;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	
	
	

}
