package sl314.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sl314.model.League;

@WebServlet("/success_page.view")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		League league = (League) request.getAttribute("LEAGUE");
		out.println("League Added Successfully<br/>");
		out.println("Title" + league.getTitle() + "<br/>");
		out.println("Year" + league.getYear() + "<br/>");
		out.println("Season" + league.getSeason() + "<br/>");
		out.println("<a href='admin/add_league.html'>Add Another League</a>");

	}

}
