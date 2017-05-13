package assignment3;

public class TestSavingsAccount {
    public static void main(String[] args) {
        TestSavingsAccount testSavingsAccount = new TestSavingsAccount();
        SavingsAccount saver1=new SavingsAccount(2000);
        SavingsAccount saver2=new SavingsAccount(3000);    
        SavingsAccount.setAnnualInterestRate(4);
        saver1.setSavingsBalance();
        saver2.setSavingsBalance();
        System.out.println("saver1 balance is "+saver1.getSavingsBalance());
        System.out.println("saver2 balance is "+saver2.getSavingsBalance());
        SavingsAccount.setAnnualInterestRate(5);
        saver1.setSavingsBalance();
        saver2.setSavingsBalance();
        System.out.println("new saver1 balance is "+saver1.getSavingsBalance());
        System.out.println("new saver2 balance is "+saver2.getSavingsBalance());
        
        
    }
}
