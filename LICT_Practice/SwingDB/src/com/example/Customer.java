package com.example;

public class Customer {

	private int id;
	private String firstName, lastName;
	private float amount;

	public Customer()
	{

	}

	public Customer(int id, String firstName, String lastName, float amount)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.amount = amount;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public float getAmount()
	{
		return amount;
	}

	public void setAmount(float amount)
	{
		this.amount = amount;
	}

}
