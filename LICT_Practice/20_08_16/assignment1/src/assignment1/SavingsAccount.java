package assignment1;

public class SavingsAccount {

 private static double annualInterestRate;
    private double savingsBalance;
   static
         {
             annualInterestRate=.04;
            
         }
         {
        
         
         }
         
    public SavingsAccount(double savingsBalance) {
    this.savingsBalance=savingsBalance;
    }
    
    public double calculateMonthlyInterest()
    {
        double dd;
        dd=(double)savingsBalance*annualInterestRate;
        dd=(double)dd/12.00;
       dd=dd+savingsBalance;
        return dd;
    
    }
   
   
    public static void modifyInterestRate()
        {
           
           annualInterestRate=.05;
           
        }
    public void monthlyBalance()
    {
    
      System.out.println("total balanace:- "+calculateMonthlyInterest());
    }
}
