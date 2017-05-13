package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerOperation {

	public CustomerOperation()
	{
	}

	int insertData(Customer customer) throws SQLException
	{
		Connection connection = new DBConnection().getConnection();
		PreparedStatement pStatement = connection.prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");

		pStatement.setInt(1, customer.getId());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setFloat(4, customer.getAmount());

		int ret = pStatement.executeUpdate();

		connection.close();

		return ret;
	}

	List<Customer> getAllData() throws SQLException
	{
		Connection connection = new DBConnection().getConnection();
		PreparedStatement pStatement = connection.prepareStatement("SELECT * FROM customer");
		ResultSet rs = pStatement.executeQuery();

		List<Customer> list = new ArrayList<Customer>();

		while (rs.next())
		{
			Customer c = new Customer();
			c.setId(rs.getInt(1));
			c.setFirstName(rs.getString(2));
			c.setLastName(rs.getString(3));
			c.setAmount(rs.getFloat(4));
			list.add(c);
		}

		connection.close();

		return list;
	}

}
