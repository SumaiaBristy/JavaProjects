package oracle;

public class AccountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int interestPeriod=3;
		double interestRate=.02d;
	    Savings[] savingsArray;
		Checking[] checkingArray;
		savingsArray=new Savings[20];
		checkingArray=new Checking[20];
		int accountNo=100;
		double initialbalance=1000d;
		for(int i=0;i<10;i++)
		{
			savingsArray[i]=new Savings(accountNo,initialbalance);
			checkingArray[i]=new Checking(accountNo,initialbalance);
			savingsArray[i].setInterestRate(interestRate);
			
			accountNo++;
			initialbalance=initialbalance+1000d;
			
			
		}
		for(int i=0;i<5;i++)
		{
		
			System.out.println(checkingArray[i].toString());
			System.out.println("Interest earned = "+checkingArray[i].computeInterest(interestPeriod));
			//System.out.println(savingsArray[i].toString());
		
		}
		
		for(int i=5;i<10;i++)
		{
		
			System.out.println(savingsArray[i].toString());
			System.out.println("Interest earned = "+savingsArray[i].computeInterest(interestPeriod));
			//System.out.println(savingsArray[i].toString());
		
		}
	}

}
