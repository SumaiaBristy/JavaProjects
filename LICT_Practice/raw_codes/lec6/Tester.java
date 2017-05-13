package test.mytest;
import comm.example.Employee;
import comm.mypack.Department;
public class Tester
{

public static void main(String args[])
{

     Department d1=new Department("AC");
	Employee e1=new Employee("rahul ",10000,d1);
	e1.displayEmployee();

}

}