package comm.example;
import java.util.Scanner;
public class EmployeeFactory {
	
	private Employee employees[];
   private static Scanner scanner=null;
   
   static
   {
	   
	   scanner=new Scanner(System.in);
   }
   
   public EmployeeFactory() {
		super();
	}

	public void input(Employee e) //parameter hocche emplyee type er ekta reference variable
	{
		System.out.println("Enter employee no: ");
		
		int id=scanner.nextInt();
		
       System.out.println("Enter employee name: ");
		String name=scanner.next();
		
      System.out.println("Enter Lane no: ");
		
		int l=scanner.nextInt();
		
		System.out.println("Enter city: ");
		String city=scanner.next();
		
		System.out.println("Enter country: ");
		String cntry=scanner.next();
		e.setId(id);
		e.setName(name);
		e.getAddress().setCity(city);
		e.getAddress().setCountry(cntry);
		e.getAddress().setLaneno(l);
		
		
	}
	
	public void createEmployees()
	{
		
		System.out.println("enter no of emplyees: ");
		int no=scanner.nextInt();
		employees=new Employee[no];
		
		for(int i=0;i<employees.length;i++)
		{
			
			Address a=new Address();
			employees[i]=new Employee(a);
			input(employees[i]);
			
		}
		
	}
	
	public void display()
	{
		
		System.out.println("displaying employee details:\n ");
		
		for(Employee e:employees)
		{
			
			System.out.print(e.toString());
			
		}
		
	}
	
}
