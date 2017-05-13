package assignment_2;

public class Employee {

    private String firstNmae;
    private String lastName;
    private double salaryMonthly;
    public Employee() {
    }
    public Employee(String fName,String lName,double s) {
        this.firstNmae=fName;
        this.lastName=lName;
        this.salaryMonthly=s;
        
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public void setFirstNmae(String firstNmae) {
        this.firstNmae = firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salaryMonthly;
    }

    public void setSalary(double salary) {
        if(salary>0)this.salaryMonthly = salary;
        else this.salaryMonthly=0;
    }
    public double getSalaryYearly() {
        return salaryMonthly*12;
    }
}