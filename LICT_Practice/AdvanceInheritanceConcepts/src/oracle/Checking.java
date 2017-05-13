package oracle;

public class Checking extends Account{

	public Checking(int accountNo) {
		super(accountNo);
		// TODO Auto-generated constructor stub
	}
	

	
	
	public Checking(int accountNo, double balance) {
	
		//super(accountNo, balance);
		setBalance(balance);
		setAccountNo(accountNo);
	//	System.out.println("acc "+accountNo+" blnc "+balance);
		// TODO Auto-generated constructor stub
	}




	@Override
	public double computeInterest(int interestPeriod) {
		// TODO Auto-generated method stub
		double interestEarned=(balance-700d)*.02d*interestPeriod;
		return interestEarned;
	}

	@Override
	public String toString() {
		return "Checking\n accountNo #=" + accountNo + "\n Account balance=" + super.getBalance();
	}

}
