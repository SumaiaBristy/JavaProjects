package comm.example;

public class Student {
	
	private int roll;
	private String name;
	private String stream;
	public Student() {
		super();
	}
	public Student(int roll, String name, String stream) {
		super();
		this.roll = roll;
		this.name = name;
		this.stream = stream;
	}
	protected int getRoll() {
		return roll;
	}
	protected void setRoll(int roll) {
		this.roll = roll;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getStream() {
		return stream;
	}
	protected void setStream(String stream) {
		this.stream = stream;
	}
	

}
