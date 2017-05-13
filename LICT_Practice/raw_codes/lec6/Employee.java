package comm.example;
import comm.mypack.Department;
public class Employee
{
	private String name;
	private double salary;
	private Department department;
	public Employee()
	{



	}
	public Employee(String name, double salary,Department department)

    {
	   this.name=name;
	   this.salary=salary;
	   this.department=department;

	}


	public void displayEmployee()
	{

		System.out.println("name: "+name+" department"+department.displayDept());//+department.displayDept());
	}
}