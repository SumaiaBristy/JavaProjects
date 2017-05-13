package comm.code;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private Connection connection = null;

	public Connection getSQLConnection()
	{
		try
		{
			//Step-1
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//Step-2
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni_db", "root", "7301");
		} catch (SQLException e)
		{
			System.out.println("Connection failed");
		}

		return connection;
	}

}