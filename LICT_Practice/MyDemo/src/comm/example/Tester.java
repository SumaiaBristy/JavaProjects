package comm.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String args[]){
	try{
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Book book=(Book)context.getBean("b");
	System.out.println(""+book.getBookDetails());
	}
	catch(Exception e)
	{
		
		e.printStackTrace();
	}
	}
	
}
