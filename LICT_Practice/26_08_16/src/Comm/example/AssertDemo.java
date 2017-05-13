package Comm.example;

public class AssertDemo {

	public static void main(String args[])
	{
		
		
		int a=5;
		int fact=1;
		for(;a>=1;a--)
		{
			
			fact=fact+a;
		}
		assert(fact==120):"Correct"; //assertion enable korte hole jvm ke bolte hobe assertion enable korar jnno
		System.out.println("fact=: "+fact);
	}
	
}
