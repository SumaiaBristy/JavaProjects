package oracle;

public abstract class Account {
	protected int accountNo;
	protected double balance;
	
	
	public Account() {
		super();
	}
	public Account(int accountNo) {
		super();
		this.accountNo = accountNo;
	}
	public Account(int accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance=0d;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
	
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	public abstract double computeInterest(int interest);
	

}
