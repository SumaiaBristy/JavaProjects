package comm.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
			Employee emp=(Employee)context.getBean("e");
			System.out.println(emp.show());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
