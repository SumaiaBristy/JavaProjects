package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Employeee employeee=null;
			
			SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			employeee=new Employeee(10,"Sachin");
			Transaction tr=session.beginTransaction();
			session.persist(employeee);
			System.out.println("One Record Inserted.");
			employeee=new Contract_Employee(20,"Sourav",10,"20Hr.");
			session.save(employeee);
			System.out.println("One Record Inserted.");
			employeee=new Regular_Employee(30,"Rahul",20000f,2000);
			session.persist(employeee);
			System.out.println("One Record Inserted.");
			tr.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
