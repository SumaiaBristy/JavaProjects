package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection connection = null;

	public DBConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}

		try
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LICT_MySQL", "root", "");
		} catch (SQLException e)
		{
			System.out.println("Connection failed");
		}
	}

	public Connection getConnection()
	{
		return connection;
	}

}
