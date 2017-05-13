package comm.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServelet
 */
@WebServlet("/employee.view")
public class MyServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private String name;
	private int id;
	private String dept;
	private double salary;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		name=request.getParameter("ename"); //o0bject hisebe pacchi so parseint diye convert krte hbe
		id=Integer.parseInt(request.getParameter("eid"));
		salary=Double.parseDouble(request.getParameter("esalary"));
		dept=request.getParameter("edept");
		
	   
		
		Employee employee=new Employee(id,salary,name,dept);
		out.println("An Employee added successsfully...<br>");		
		out.println("Name: "+employee.getName()+"<br>");
		out.println("ID: "+employee.getId()+"<br>");
		out.println("department: "+employee.getDept()+"<br>");
		out.println("salary: "+employee.getSalary()+"<br>");
	
	}

}
