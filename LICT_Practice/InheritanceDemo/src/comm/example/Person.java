package comm.example;

public class Person {
	private String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDetails()
	{
		return "name: "+getName();
		
	}

}
