package Comm.example;



import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cus=new Customer();
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction tr=session.beginTransaction();
		String str="from Customer";
	    Query q=session.createQuery(str);
	    Iterator i=q.iterate();
	    System.out.println("ID\tFirst Name\t Last name\tAmount\n=======\n");
	    while(i.hasNext())
	    {
	    	
	    	Customer cc=(Customer)i.next();
	    	System.out.println(cc.getId()+"\t"+cc.getFirstname()+"\t"+cc.getLastname()+"\t"+cc.getAmount());;
	    	
	    }

	}

}
