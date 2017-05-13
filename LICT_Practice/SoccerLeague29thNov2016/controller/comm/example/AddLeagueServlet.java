package comm.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add_league.servlet")
public class AddLeagueServlet extends HttpServlet {

	private String title;
	private String season;
	private int iYear;
	private RequestDispatcher view=null;
	List<String> errMsgs=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			errMsgs=new ArrayList<String>();
			title=request.getParameter("title");
			if(title.trim().length()<=0)
			{
				errMsgs.add("Title Field Can Not Be Blank");
			}
			try
			{
				iYear=Integer.parseInt(request.getParameter("year").trim());
			}
			catch(Exception e)
			{
				errMsgs.add("Year Field Must be Numeric");
			}
			season=request.getParameter("season");
			if(season.trim().equals("UNKNOWN"))
			{
				errMsgs.add("Unknown Season");
			}
			if(!errMsgs.isEmpty())
			{
				request.setAttribute("ERROR", errMsgs);
				view=request.getRequestDispatcher("error_page.view");
				view.forward(request, response);
				
			}
			else
			{
				League league=new League(title,iYear,season);
				request.setAttribute("LEAGUE", league);
				view=request.getRequestDispatcher("success_page.view");
				view.forward(request, response);
			} 
		}
	}

