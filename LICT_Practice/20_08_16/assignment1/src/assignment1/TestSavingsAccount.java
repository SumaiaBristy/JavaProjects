package assignment1;

public class TestSavingsAccount {
    public static void main(String[] args) {
    
     SavingsAccount saver1=new SavingsAccount(2000);
     SavingsAccount saver2= new SavingsAccount(3000);
     saver1.monthlyBalance();
     saver2.monthlyBalance();
     saver1.modifyInterestRate();
     saver2.modifyInterestRate();
     saver1.monthlyBalance();
     saver2.monthlyBalance();
    }
}
