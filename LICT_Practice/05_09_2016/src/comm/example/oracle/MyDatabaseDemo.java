package comm.example.oracle;

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
			int choice=-1;
			do
			{
				System.out.println("1. create New Account\n");
				System.out.println("2. Display All Account\n");
				System.out.println("0. Exit\n");
				System.out.println("1. your choice please--->\n");
				choice=sc.nextInt();
				switch(choice)
				{
				
				case 1:
					System.out.print("enter ID: ");
					int id=sc.nextInt();
					System.out.print("enter Name: ");
					String name=sc.next();
					System.out.print("enter Address: ");
					String addr=sc.next();
					pStatement=connection.prepareStatement("insert into ACCOUNT values(?,?,?)");
					pStatement.setInt(1,id);
					pStatement.setString(2,name);
					pStatement.setString(3, addr);
					int a=pStatement.executeUpdate();
					System.out.println(a+" row(s)"+" inserted succesfully!!!");
					break;
					case 2:
						//System.out.print("display table rows!!");
						statement=connection.createStatement();
						rs=statement.executeQuery("select * from ACCOUNT");
						while(rs.next())
						{
							
							
									System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
							
						}
						break;
						case 0:
							System.out.println("good bye!!");
						break;
					default:
						System.out.println("invalid input");
						break;
					
				}
				
			}while(choice!=0);
			
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
