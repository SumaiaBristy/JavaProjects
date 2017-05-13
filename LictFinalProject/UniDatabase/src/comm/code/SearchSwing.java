package comm.code;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SearchSwing extends JFrame implements ActionListener{
	private JLabel lName=null;
	private JTextField tName=null;
	
	private JButton search=null;

	public SearchSwing() throws HeadlessException {
		super();
		lName=new JLabel("Student ID: ");
		tName=new JTextField(20);
		search=new JButton("Search");
		
		this.setSize(400,100);
		this.setLayout(new FlowLayout());
		this.add(lName);
		this.add(tName);
		this.add(search);
		
		search.addActionListener(this);
		
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String searchID=tName.getText();
		//Tester tester=new Tester();
		Student student=new Tester().search(searchID);
		JOptionPane.showMessageDialog(search, "Student ID: "+student.getStudentID()+"\nName: "+ student.getStudentName()+ "\nDepartment: "+student.getDept()+" \nFather Name: "+student.getFatherName()+" \nMother Name: "+student.getMotherName()+"\nSex: "+student.getSex()+"\nAddress: "+student.getAddress()+"\nHSC Year: "+student.getYear());
	}
}
