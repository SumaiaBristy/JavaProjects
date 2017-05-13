package comm.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServerlet
 */
@WebServlet("/controller.servelet")
public class ControllerServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public String uName;
	public String uPass;
	private RequestDispatcher view=null;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		uName=request.getParameter("uname");
		uPass=request.getParameter("upass");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("controller passed the control to the next page</br>");
		
		if((uName.equals("admin"))&&(uPass.equals("admin")))
		{
			User u=new User(uName,uPass);
			request.setAttribute("A",u);//attribute hcche reference number
			//success page e reference pass pathabe
			
			view=request.getRequestDispatcher("success.view");
			view.forward(request,response); //request ta success.view page e jacche erro thkle error servelet page e jabe
		}
		
		else
		{
			
			view=request.getRequestDispatcher("error.view");
			view.include(request,response);
		}
	}

}
