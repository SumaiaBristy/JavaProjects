package comm.code;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StudentLogIn extends JFrame implements ActionListener {
	private JLabel lUser=new JLabel("Student ID:");
	private JLabel lPass= new JLabel("Password:");
	private JTextField tUser= new JTextField(20);
	private JPasswordField tPass= new JPasswordField(20);
	private JButton login=new JButton("Log In");
	

	public StudentLogIn() throws HeadlessException {
		super();
		
		this.setSize(300,200);
		this.setLayout(new FlowLayout());
		
		this.add(lUser);
		this.add(tUser);
		this.add(lPass);
		this.add(tPass);
		this.add(login);
		this.setVisible(true);
		
		login.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Student student=new Tester().search(tUser.getText());
		if(student.getPass().equals(tPass.getText()))
			new StudentGUI(student);
		else JOptionPane.showMessageDialog(login, "Student ID or Password is invaid! "+tPass.getText()+" "+student.getPass());

	}
	
	

}
