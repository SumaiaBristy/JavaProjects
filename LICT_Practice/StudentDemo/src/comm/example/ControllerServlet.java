package comm.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

public class ControllerServlet extends HttpServlet {
	private int roll;
	private String name;
	private String stream;
	private Connection connection=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		roll=Integer.parseInt(request.getParameter("t1"));
		name=request.getParameter("t2");
		stream=request.getParameter("t3");
		try {
			MyConnectionFactory factory=new MyConnectionFactory();
			connection=factory.getMySqlConnection();
			java.sql.PreparedStatement pst=connection.prepareStatement("insert into STUDENTS values(?,?,?)");
			pst.setInt(1, roll);
			pst.setString(2, name);
			pst.setString(3, stream);
			pst.executeUpdate();
			out.println("One Student Added Successfully..");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
