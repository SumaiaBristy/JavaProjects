package comm.example;

import java.util.Iterator;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class StudentFactory {

	
	private Statement statement;
	private Connection con=null;
	private ResultSet rs=null;
	private List<Student> list=null;
	OracleConnectionFactory factory=null;
	public StudentFactory()
	{
		
		super();
		list=new ArrayList<Student>();
		factory=new OracleConnectionFactory();
	}
	public void displayStudents() throws SQLException
	{
		
		con = factory.getOracleConnection();
		//step-3
		statement=con.createStatement();
		//step-4
		rs=statement.executeQuery("select * from STUDENT");
		while(rs.next())
		{
			
			int id=rs.getInt(1);
			String name=rs.getString(2);
					String address=rs.getString(3);
					Student s=new Student(id,name,address);
					list.add(s);
			
		}
		Iterator<Student> i=list.iterator();
		while(i.hasNext())
		{
			
			Student ss=i.next();
			System.out.println(""+ss.getId()+""+ss.getName()+""+ss.getAddress());
		}
		
	}
}
