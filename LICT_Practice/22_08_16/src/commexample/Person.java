package commexample;

public class Person {
	
	private String name;
	private int age;
	public Person()
	{
		
		
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		/*Person p=null;
		boolean flag=false;
		if(obj instanceof Person)
		{
		   p=(Person)obj; //obj here is person2 
		   if((this.name==p.name)&&(this.age==p.age)) //this is 'person'
		   {
			   
			   flag=true;
		   }
		}
		else
		{
			flag=false;
			
		}
		return flag;*/
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

	
}
