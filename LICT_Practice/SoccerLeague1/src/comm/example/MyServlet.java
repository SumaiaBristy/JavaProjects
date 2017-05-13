package comm.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(
		urlPatterns = { "/index.html" }, 
		initParams = { 
				@WebInitParam(name = "season-list", value = "summer,winter,autumn"), 
				@WebInitParam(name = "list-dept", value = "cse,eee,me,civil")
		})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * 
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<form action='controller.do' method='post'>");
		out.println("Title<input type='text' name='t1'><br/>");
		out.println("Year<input type='text' name='t2'><br/>");
		String param=this.getServletConfig().getInitParameter("season-list");
		String arr[]=param.split(",");
		out.println("Season<select name='t3'>");
		out.println("<option value='UNKNOWN'>Select...</option>");
		for(String str:arr)
		{
			out.println("<option value='"+str+"'>"+str+"</option>");
			
		}
		
		out.println("</select></form></body></html>");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
