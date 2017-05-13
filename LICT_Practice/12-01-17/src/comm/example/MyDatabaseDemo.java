package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;



public class MyDatabaseDemo {
	
	//displaying
	static Scanner sc = new Scanner(System.in);
	private static Statement statement;
	private static ResultSet rs=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement pStatement=null;
		
		try
		{
			//driver register kora-step_1
		//	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());//oracle.jdbc.driver package er method OracleDriver() te object pass korano hobe
			Class.forName("oracle.jdbc.driver.OracleDriver"); //java.lang package e ei class ta ase jei package take import krte hoy na,by default ase
			//Class.forname use kora hocche to avoid new (drivermanager)
			//drivermanager er execution fatser than forname
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
						statement=connection.createStatement();
						rs=statement.executeQuery("select Employee_id,First_name,Last_name from Employees");
						while(rs.next())
						{
							
							
									System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
							
						}
		}
					
		catch(Exception e)
		{
			System.out.println(e.toString());
			
		}
		finally
		{
			try{
			connection.close();
			}
			catch(SQLException e)
			{
				
				e.printStackTrace();
				
			}
		}
	}

}
