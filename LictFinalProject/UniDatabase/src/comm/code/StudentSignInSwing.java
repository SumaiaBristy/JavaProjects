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

public class StudentSignInSwing extends JFrame implements ActionListener{
	private JLabel lId=null;
	private JLabel lName=null;
	private JLabel lfName=null;
	private JLabel lmName=null;
	private JLabel lAddress=null;
	private JLabel lSex=null;
	private JLabel lYear=null;
	private JLabel lPass=null;
	
	private JTextField tId=null;
	private JTextField tName=null;
	private JTextField tfName=null;
	private JTextField tmName=null;
	private JTextField tAddress=null;
	private JTextField tSex=null;
	private JTextField tYear=null;
	private JPasswordField tPass=null;
	
	
	private JButton signIn=null;

	public StudentSignInSwing() throws HeadlessException {
		super();
		lId=new JLabel("Student ID: ");
		lName=new JLabel("Name: ");
		lfName=new JLabel("Father's Name: ");
		lmName=new JLabel("Mothers Name: ");
		lAddress=new JLabel("Address: ");
		lSex=new JLabel("Sex: ");
		lYear=new JLabel("HSC Year: ");
		lPass=new JLabel("Password: ");
		
		tId=new JTextField(20);
		tName=new JTextField(20);
		tfName=new JTextField(20);
		tmName=new JTextField(20);
		tAddress=new JTextField(20);
		tSex=new JTextField(20);
		tYear=new JTextField(20);
		tPass= new JPasswordField(20);
		signIn=new JButton("Sign In");
		
		this.setSize(260, 450);
		this.setLayout(new FlowLayout());
		this.add(lId);
		this.add(tId);
		this.add(lName);
		this.add(tName);
		this.add(lfName);
		this.add(tfName);
		this.add(lmName);
		this.add(tmName);
		this.add(lSex);
		this.add(tSex);
		this.add(lAddress);
		this.add(tAddress);
		this.add(lYear);
		this.add(tYear);
		this.add(lPass);
		this.add(tPass);
		
		this.add(signIn);
		
		signIn.addActionListener(this);
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Student student=new Student(Integer.parseInt(tId.getText()), tName.getText(), tfName.getText(), tmName.getText(), tSex.getText(), tAddress.getText(), tYear.getText(), tPass.getText());
		String msg=new Tester().InsertData(student);
		this.setVisible(false);
		JOptionPane.showMessageDialog(signIn,msg);
		
	}
}
