package comm.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import comm.example.Employee;


public class Tester {
	private Connection connection;
	private PreparedStatement pStatement;

	public void display() {
		connection=new ConnectionFactory().getSQLConnection();
		
		try {
			Statement statement= connection.createStatement();
			ResultSet rs=statement.executeQuery("SELECT * FROM student_info");
			
			/*pStatement=connection.prepareStatement("SELECT * FROM student_info where student_id like ?");
			pStatement.setString(1, "1102006");
			ResultSet rs = pStatement.executeQuery();*/
			
			List<Student> list=new ArrayList<Student>();
            
            while(rs.next()){
            	int id=rs.getInt(1);
            	String name=rs.getString(2);
            	String fName=rs.getString(3);
            	String MName=rs.getString(4);
            	String sex=rs.getString(5);
            	String age=rs.getString(6);
            	String yr=rs.getString(7);
            	String pass=rs.getString(8);
            	String dept=rs.getString(9);
            	
            	Student student=new Student(id, name, fName, MName, sex, age, yr, pass, dept);
            	list.add(student);
            }
            
            Iterator<Student> i = list.iterator();
            
            while(i.hasNext()){
            	Student s=i.next();
            	System.out.println(s.getStudentID()+" "+s.getStudentName()+" "+s.getFatherName()+" "+s.getMotherName()+" "+s.getAddress()+" "+s.getSex()+" "+s.getYear());
            }
            	
			
			
		} catch (Exception e) {
            System.out.println("Display failed");
            System.out.println(e.toString());       	
		}
	}
	
	
	
	public Student search(String searchID) {
		connection=new ConnectionFactory().getSQLConnection();
		 Student student = null;
		try {
			//Statement statement= connection.createStatement();
			//ResultSet rs=statement.executeQuery("SELECT * FROM student_info");
			
			pStatement=connection.prepareStatement("SELECT * FROM student_info where student_id like ?");
			pStatement.setString(1, searchID);
			ResultSet rs = pStatement.executeQuery();
			
			//List<Student> list=new ArrayList<Student>();
            
            while(rs.next()){
            	int id=rs.getInt(1);
            	String name=rs.getString(2);
            	String fName=rs.getString(3);
            	String MName=rs.getString(4);
            	String sex=rs.getString(5);
            	String age=rs.getString(6);
            	String yr=rs.getString(7);
            	String pass=rs.getString(8);
            	String dept=rs.getString(9);
            	
            	student=new Student(id, name, fName, MName, sex, age, yr, pass, dept);
            	//list.add(student);
            }
            
            //Iterator<Student> i = list.iterator();
            
            //while(i.hasNext()){
            	//Student s=i.next();
            	//System.out.println(s.getStudentID()+" "+s.getStudentName()+" "+s.getFatherName()+" "+s.getMotherName()+" "+s.getAddress()+" "+s.getSex()+" "+s.getYear());
            //}
            	
			
			
		} catch (Exception e) {
            System.out.println("Display failed");
            System.out.println(e.toString());       	
		}
		return student;
	}


public String InsertData(Student student) {
	connection=new ConnectionFactory().getSQLConnection();
	String department=null;
	try {
		//Statement statement= connection.createStatement();
		//ResultSet rs=statement.executeQuery("SELECT * FROM student_info");
		
		pStatement=connection.prepareStatement("insert into uni_db.student_info values(?,?,?,?,?,?,?,?,?);");
		String ID=Integer.toString(student.getStudentID());
		pStatement.setString(1, ID);
		pStatement.setString(2, student.getStudentName());
		pStatement.setString(3, student.getFatherName());
		pStatement.setString(4, student.getMotherName());
		pStatement.setString(5, student.getSex());
		pStatement.setString(6, student.getAddress());
		pStatement.setString(7, student.getYear());
		pStatement.setString(8, student.getPass());
		String deptId=ID.substring(2,4);
		System.out.println(deptId);
		if(deptId.equals("02")) department="EEE";
		else if(deptId.equals("03")) department="ME";
		else if(deptId.equals("04")) department="CSE";
		else department="Unknown";
		pStatement.setString(9, department);
		
		pStatement.execute();
		
		return "Successful!!";
        	
		
		
	} catch (Exception e) {
        //System.out.println("Display failed");
        return e.toString();       	
	}
}


}