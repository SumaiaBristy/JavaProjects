package comm.code;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class StudentGUI extends JFrame implements ActionListener{
	
	Student studentThis=null;
	private JButton viewProfile=new JButton("Profile");
	private JButton registration=new JButton("Course Registration");
	private JLabel title=null;
	
	public StudentGUI(Student student) throws HeadlessException {
		super();
		this.studentThis=student;
		title=new JLabel("Welcome "+student.getStudentName());
		this.setSize(300,200);
		this.setLayout(new FlowLayout());
		this.add(title);
		this.add(viewProfile);
		this.add(registration);
		
		viewProfile.setActionCommand("view");
		viewProfile.addActionListener(this);
		registration.setActionCommand("reg");
		registration.addActionListener(this);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="view")
			this.viewProfile(studentThis);
		else if(e.getActionCommand()=="reg")
			new Registration(studentThis);
			//JOptionPane.showMessageDialog(registration,"This option is under constraction!!!");
	}
	
	public void viewProfile(Student student){
		JOptionPane.showMessageDialog(viewProfile, "Welcome!\nStudent ID: "+student.getStudentID()+"\nName: "+ student.getStudentName()+" \nDepartment: "+student.getDept()+" \nFather Name: "+student.getFatherName()+" \nMother Name: "+student.getMotherName()+"\nSex: "+student.getSex()+"\nAddress: "+student.getAddress()+"\nHSC Year: "+student.getYear());
	}
	
}