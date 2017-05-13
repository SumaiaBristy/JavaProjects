package comm.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List list=new ArrayList();
	/*	Set list=new TreeSet();
		list.add(new Customer("A",2000));
		list.add(new Customer("B",100));
		list.add(new Customer("C",10000));
		list.add(new Customer("D",10));
		list.add(new Customer("E",100000));
		list.add(new Customer("BB",300));
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			
			Customer cc=(Customer)i.next();
			System.out.println(""+cc.getName()+" "+cc.getAmount());
			
		}

		*/
		/*Object oo[]=list.toArray();
		Customer ccc=null;
		for(Object ooo:oo)
		{ 
			
			
			ccc=(Customer)ooo;
			System.out.println(""+ccc.getName()+" "+ccc.getAmount());
		}*/
//	List<Integer> list =new ArrayList<Integer>(); //here List will not accept any primitive data type but wrapper type
	
	//list.add(new Customer("abcd",1000));
		List <A> list=new ArrayList<A>();
		list.add(new A());
		list.add(new B()); //jehetu B A k extend krse so we can put B into list too
	}

}
