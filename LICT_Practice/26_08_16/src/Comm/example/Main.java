package Comm.example;
import static java.lang.System.out; // static member k import kora holo
import static java.lang.System.in;

import java.util.Scanner;
public class Main {
	private static Scanner sc=null;
	static
	{
		
		sc=new Scanner(in);
	}
	public static void main(String[] args) throws NullPointerException//, MyException

	{
		
	//ThrowsDemo th=new ThrowsDemo();	
	//th.addInt();
	//th.A();
		/*Customer c=null;
		c.setCustomerId("10");
		c.setCustomerName("sachin");
		try{
			
			c.displayCustomer(c);
			
		}
		catch(Exception e)
		{
			System.out.println("handled by main!!");
			
		}*/
		/*out.print("enter email id: ");
		String email=sc.next();
		if(email.indexOf('@')<=0)
		{
			
			try {
				throw new MyException("email must content @");  //either ei line ta ke try-catch block e rkhbo
				//or main method  Myexception k extend krte hbe
			} catch (MyException e) {
				// TODO Auto-generated catch block
				
				out.println("email must contain @");
				//e.printStackTrace();
			} 
			
		}*/
		
		out.print("enter first name: ");
		String FirstName=sc.next();
		out.print("enter last name: ");
		String LastName=sc.next();
		out.print("enter employee id: ");
		String Id=sc.next();
		if(FirstName.length()<5)
		{
			
			try {
				throw new MyException("First Name:- Must be 5");  //either ei line ta ke try-catch block e rkhbo
				//or main method  Myexception k extend krte hbe
			} catch (MyException e) {
				// TODO Auto-generated catch block
				
				out.println(e.toString());
				//e.printStackTrace();
			} 
			
		}
		
		if(LastName.length()<5)
		{
			
			try {
				throw new MyException("last Name:- Must be 5");  //either ei line ta ke try-catch block e rkhbo
				//or main method  Myexception k extend krte hbe
			} catch (MyException e) {
				// TODO Auto-generated catch block
				
				out.println(e.toString());
				//e.printStackTrace();
			} 
			
		}
		
		
		
	}

}
