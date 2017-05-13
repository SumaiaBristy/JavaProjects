package comm.mypack;
public class Department
{

	String deptId;
	public Department()
	{



	}
	public Department(String deptId)
	{
		this.deptId=deptId;
	}
	public String displayDept()
	{
		return "department id: "+deptId;

	}
}