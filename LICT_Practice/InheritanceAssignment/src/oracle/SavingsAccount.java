package oracle;

public class SavingsAccount extends BankAccount {
	private static double rate=.025d;
	private int savingsNumber=0;
	private String accountNumber;
	 private double amount;
	 private String name;
	 
	public SavingsAccount(String name,double amount)
	{
		    this.amount=amount;
		    this.name=name;
		    accountNumber=super.getAccountNumber();
		  
		    
		   
	}
	public SavingsAccount(SavingsAccount oldAccount,double amount) //amount=initial balance
	{
		
		
		savingsNumber =oldAccount.savingsNumber;
	    accountNumber = oldAccount.accountNumber;
		this.amount=amount;
		this.name=oldAccount.name;
		
		 savingsNumber++;
		  BankAccount.numberOfAccounts=numberOfAccounts-savingsNumber;
	}
	public void postInterest()
	{
		//double amount;
		
		amount=amount+(amount*rate)/12d;
		
		
		
	}
	@Override
	public void deposit(double balance) {
		// TODO Auto-generated method stub
		amount=amount+balance;
	}
	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber+"-"+savingsNumber;
	}
	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return amount;
	}
	
   

}
