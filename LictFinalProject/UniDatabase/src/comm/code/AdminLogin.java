package comm.code;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends JFrame implements ActionListener{
	private JLabel lUser=new JLabel("User Name: ");
	private JLabel lPass= new JLabel("Password:");
	private JTextField tUser= new JTextField(20);
	private JPasswordField tPass= new JPasswordField(20);
	private JButton login=new JButton("Log In");
	
	public AdminLogin() {
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
		if(tUser.getText().equals("root") && tPass.getText().equals("root")){
			this.setVisible(false);
			new AdminSwing();
			
		}
		else JOptionPane.showMessageDialog(login,"User ID or Password is invalid!");
		
	}
	
	

}
