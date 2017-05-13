package comm.example;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e=new Employee();
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction tr=session.beginTransaction();
		String str="from Customer";
		
		
		Criteria cr=session.createCriteria(Employee.class); //query er jaygay criteria use korele onek fast tai
		//cr.setFirstResult(1);
		//cr.setMaxResults(4);
		
		
		
		
		Criterion nameRestriction=Restrictions.like("name","%");
		cr.add(nameRestriction);
		java.util.List<Employee> l=cr.list(); //if we dont set any criteria then list() will byddefault select the all data from table
		for(Employee c:l)
		{
			System.out.println(c.getName()+"\t"+c.getSalary());
			
		}
	}

}
