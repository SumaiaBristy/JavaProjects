package oracle;


public class CheckingAccount extends BankAccount {
	
	private static double FEE=0.15d;
	  private String name;
	  private double amount;
	
	public CheckingAccount(String name,double amount)
	{
		//super();
	    this.amount=amount;
	    this.name=name;
		
	}
	@Override
	public boolean withdraw(double blnc)
	{
		boolean completed = true;
		if (blnc <= amount)
		{
		amount= amount-(blnc+FEE);
		}
		else
		{
		completed = false;
		}
		return completed;	
			
	}
	@Override
	public void deposit(double balance) {
		// TODO Auto-generated method stub
		amount=amount+balance;
	}
	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return super.getAccountNumber()+"-10";
	}
	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public double getBalance()
	{
	return amount;
	}
}
