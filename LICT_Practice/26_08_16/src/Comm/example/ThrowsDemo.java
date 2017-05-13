/* eita hocche hiararchicall kivabe exception handled hoy tar exp
 * suppose ekta method A() call korse addInt() k ar A() k call korse main
 * now first e checked hobe j A() te exception ase kina jdi thake tahole tkhn i terminate krbe,addInt e jabei na
 * addInt() e exception thkle hieararchy hobe first e numberFormatException call hobe then RuntimeException-->Exception-->Throwable-->main-->object of the class
 * bydefault jehetu toString method call hoy so object class er jnno jehetu tostring call hoi
 * so amra sei toString method k numberFormatException e o pete pari...ja kora hoise code e dkho bristy =D 
 */

package Comm.example;

import java.util.Scanner;

public class ThrowsDemo {
	private static Scanner scanner;
	static 
	{
		
		
		scanner=new Scanner(System.in);
		
	}
	
	public void addInt()
	{
		try
		{
			
			
		}
		
		catch(NumberFormatException nfe)
		{
			
			System.out.println(nfe.toString()+"\n Exception handled in addInt()...!");
			
		}
		/*System.out.print("Enter A number: ");
		String str=scanner.next(); // ja kisu scan krbo will be converted to string
		int a=Integer.parseInt(str);
		System.out.print("Enter Another number: ");
		String str1=scanner.next(); 
		int b=Integer.parseInt(str1);
		int c=a+b;
		System.out.print("addition of a and b: "+c);*/
		
		
		
	}
	//caller e exception peye gele se ar caller jake call krse seta te jabei na....
	//like A() te exception peye gele addInt e ar jabei na
	public void A()
	{
		try{
			
			System.out.print("Enter A number: ");
			String str=scanner.next(); // ja kisu scan krbo will be converted to string
			int a=Integer.parseInt(str);
			System.out.print("Enter Another number: ");
			String str1=scanner.next(); 
			int b=Integer.parseInt(str1);
			int c=a+b;
			System.out.print("addition of a and b: "+c);
		
		//addInt();
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe.toString()+"\n Exception handled by caller(A())...!");
			
			
		}
		
	}

}
