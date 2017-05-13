package comm.example;

import java.io.Serializable;

public class Regular_Employee extends Employee implements Serializable {
	
	private float salary;
	private int bonus;
	public Regular_Employee() {
		super();
	}
	public Regular_Employee(int id,String name,float salary, int bonus) {
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
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}
