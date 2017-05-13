package comm.example;

import java.util.Enumeration;
import java.util.Vector;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PlayerFactory factory=new PlayerFactory();
		factory.createPlayer();
		factory.displayPlayers();*/
		
		Vector l=new Vector();
		Enumeration e=l.elements();
		l.add(10);
		l.add("hello");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
			
		}
        
	}

}
