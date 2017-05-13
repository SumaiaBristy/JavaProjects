package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Employee employee=null;
			
			SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			employee=new Employee(10,"Sachin");
			Transaction tr=session.beginTransaction();
			session.persist(employee);
			System.out.println("One Record Inserted.");
			employee=new Contract_Employee(20,"Sourav",10.32f,"20Hr.");
			session.save(employee);
			System.out.println("One Record Inserted.");
			employee=new Regular_Employee(30,"Rahul",20000f,2000);
			session.persist(employee);
			System.out.println("One Record Inserted.");
			tr.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
