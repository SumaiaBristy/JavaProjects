package comm.code;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import comm.code.Student;
public class Registration extends JFrame implements ActionListener {
	String[] course=new String[100];
	//String[] eee=new String[100];
    
	private JButton submit= new JButton("Submit");
    
    private JCheckBox box=new JCheckBox("sgd");
	Student student=new Student();
    
    public Registration(Student student) throws HeadlessException {
		super();
		this.student=student;
		this.setSize(100, 400);
		this.setLayout(new FlowLayout());
Connection connection = new ConnectionFactory().getSQLConnection();
		if(student.getDept().equals("EEE")){
			//System.out.println("Dept: "+student.getDept());
		try {
			Statement statement= connection.createStatement();
			ResultSet rs=statement.executeQuery("SELECT * FROM eee");
			
			int i=0;
			         
            while(rs.next()){
            	JCheckBox box=new JCheckBox(rs.getString(1));
            	this.add(box);
            	course[i]=box.getText();
            	i++;
            	//int id=rs.getInt(1);
            	//String name=rs.getString(2);
            }
            
		}
		catch(Exception e1)
		{
			
			e1.printStackTrace();
		}
    }
		else if(student.getDept().equals("CSE")){
			
			try {
				Statement statement= connection.createStatement();
				ResultSet rs=statement.executeQuery("SELECT * FROM cse");
				
				int i=0;
				         
	            while(rs.next()){
	            	JCheckBox box=new JCheckBox(rs.getString(1));
	            	this.add(box);
	            	course[i]=box.getText();
	            	i++;
	            	//int id=rs.getInt(1);
	            	//String name=rs.getString(2);
	            }
	            
			}
			catch(Exception e1)
			{
				
				e1.printStackTrace();
			}
	    }


		
		this.add(submit);
		
		submit.addActionListener(this);	
		
		this.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(submit, box1.getText());
		
		
		Connection connection = new ConnectionFactory().getSQLConnection();
		String department=null;
		try {
			//Statement statement= connection.createStatement();
			//ResultSet rs=statement.executeQuery("SELECT * FROM student_info");
			
			PreparedStatement pStatement = connection.prepareStatement("insert into uni_db.student_registration values(?,?,?,?);");
			pStatement.setInt(1,student.getStudentID());
			pStatement.setString(2,student.getStudentName());
			pStatement.setString(3,course[0]);
			pStatement.setString(4,course[1]);			
			
			pStatement.execute();
			
	        JOptionPane.showMessageDialog(submit, "Successful...!!!");	
			
			
		} catch (Exception e1) {
	        e1.printStackTrace();
		}
		
	}

}
