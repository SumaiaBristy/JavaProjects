package assignment1;

public class Employee {

  private String Firstname;
  private String LastName;
  private double Salary;
    public Employee() {
    
    }
    
    public Employee(String Firstname,String LastName,double Salary)
    {
        this.Firstname = Firstname;
        this.LastName = LastName;
        this.Salary=Salary;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getSalary() {
         if(Salary<0.0)
         Salary=0.0;
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = Salary;
    }
      public double getYearlySalary()
              {
                 return (double)Salary*12;
              }
      public void displaySalary()
          {
               System.out.println("yearly salary:- "+getYearlySalary());
          
          }
        public void displaySalaryAfterIncrease()
        {
        double dd= (getYearlySalary()*10.00/100.00)+getYearlySalary();
            System.out.println("yearly salary:- "+dd);
        
        }
}

