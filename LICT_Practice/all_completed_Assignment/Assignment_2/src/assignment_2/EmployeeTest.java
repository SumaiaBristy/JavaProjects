package assignment_2;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeTest employeeTest = new EmployeeTest();
        Employee e1=new Employee("Thomas","marma",20000);
        Employee e2=new Employee("Tousif","Khan",30000);
        System.out.println("Salary of 1st employree is "+e1.getSalaryYearly());
        System.out.println("Salary of 2nd employree is "+e2.getSalaryYearly());
        e1.setSalary(e1.getSalary()+(e1.getSalary()*0.1));
        e2.setSalary(e2.getSalary()+(e1.getSalary()*0.1));
        System.out.println("Salary of 1st employree is "+e1.getSalaryYearly());
        System.out.println("Salary of 2nd employree is "+e2.getSalaryYearly());
        
    }
}
