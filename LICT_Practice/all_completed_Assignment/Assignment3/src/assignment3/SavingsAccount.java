package assignment3;

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;
    private double monthlyInterest;
    public SavingsAccount() {
    }
    public static void setAnnualInterestRate(double a) {
        SavingsAccount.annualInterestRate=a;
    }
    public SavingsAccount(double s) {
        this.savingsBalance=s;
    }
    public double calculateMonthlyInterest() {
        return ((savingsBalance*annualInterestRate)/12);
    }
    
    public void setSavingsBalance(){
        this.savingsBalance=this.savingsBalance+this.calculateMonthlyInterest();
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

   
}
