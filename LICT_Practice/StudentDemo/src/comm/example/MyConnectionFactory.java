package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hsqldb.util.SqlTool.SqlToolException;

public class MyConnectionFactory {
	
	private Connection connection=null;
	
	public Connection getMySqlConnection()throws  SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hr"+
				"?verifyServerCertificate=false"+
				"&useSSL=false"+
				"&requireSSL=true","root","root");
		return connection;
	}

}
