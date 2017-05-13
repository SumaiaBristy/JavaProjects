package comm.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PlayerFactory {
	
	private Map p;
	private static Scanner scanner;
	static{
		
		
		scanner=new Scanner(System.in);
	}

	
	public void createPlayer()
	{
		p=new HashMap();
		int choice=-1;
		do{
			System.out.println("enter player details========\n: ");
			
			System.out.println("ID: ");
			int id=scanner.nextInt();
			System.out.println("Name: ");
			String name=scanner.next();
			System.out.println("team: ");
			String team=scanner.next();
			//Player p1=new Player(id,name,team);
			p.put(Math.random(),new Player(id,name,team)); //random() 0 and 1 er mddhe random value generate kore ..use kra hoy unique key generate krar jnno
			System.out.println("press 1 o continue and  0 to exit....");
			choice=scanner.nextInt();
		
		}while(choice!=0);
		Players.addPlayer(p);
		
		System.out.println(p.entrySet());
	}
	public void displayPlayers()
	{
		Set s=p.entrySet();
		Set s1=p.keySet();
	  Iterator i1=s1.iterator();
	  System.out.println("Displaying all keys....");
	  while(i1.hasNext())
	  {
		  System.out.println(i1.next());
		  
	  }
		Collection c=p.values(); //kno collection theke value retireve korte caile we have to use iterator..iterator is an interface
		  System.out.println("Displaying all values....");
		Iterator i2=c.iterator();
		 while(i2.hasNext())
		  {
			 Player pp=(Player)i2.next();
			  System.out.println("Id: "+pp.getPlayerId()+"\nname: "+pp.getPlayerName());
			  
			  
			  
			  
			  
		  }
		
	}
}
