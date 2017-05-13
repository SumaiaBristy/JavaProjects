package oracle;

public class Savings extends Account{
	private double interestRate;
	
	public Savings(int accountNo) {
		super(accountNo);
		// TODO Auto-generated constructor stub
	}
	public Savings(int accountNo, double balance) {
		
		//super(accountNo, balance);
		setBalance(balance);
		setAccountNo(accountNo);
	//	System.out.println("acc "+accountNo+" blnc "+balance);
		// TODO Auto-generated constructor stub
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	

	@Override
	public String toString() {
		return "Savings\n accountNo #=" + accountNo + "\n Account balance=" + super.getBalance()+
				"\n Savings Rate = " + interestRate;
	}

	@Override
	public double computeInterest(int interestPeriod) {
		// TODO Auto-generated method stub
		double interestEarned=Math.pow((1+interestRate),interestPeriod)*getBalance()-getBalance();
	    return interestEarned;
	}
	
}
