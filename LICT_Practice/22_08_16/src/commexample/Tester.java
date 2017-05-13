package commexample;

public class Tester {
	
	public static void main (String[] args)
	{
		
		Person person=null;
		person=new Person("Sachin",42);
		Person person2=new Person("Sachin",42);
		String str=new String("java");
		String str1=new String("java");
		System.out.println(str==str1); //false
		System.out.println(str.equals(str1)); //true
		if(person==person2) ///== sign here check mem address;
		//if(person.equals(person2)) //equals() check contents are whether equal
		{
			
			System.out.println("both objects are equal");
			
		}
		else
		{
			System.out.println("both objects are not equal");
			
		}
		System.out.println();
		
	}

}
