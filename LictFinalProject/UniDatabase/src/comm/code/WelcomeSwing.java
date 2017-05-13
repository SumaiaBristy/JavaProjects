package comm.code;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeSwing extends JFrame implements ActionListener {
	private JLabel title=new JLabel("Welcome to CUET");
	private JButton stdntLogIn=new JButton("Log In as Student ");
	private JButton stdntSignIn=new JButton("Sign In");
	private JButton admin=new JButton("Log In as Admin");
	
	

	public WelcomeSwing() throws HeadlessException {
		super();
		this.setSize(250, 200);
		this.setLayout(new FlowLayout());
		this.add(title);
		title.setForeground(Color.red);
	    title.setFont(new Font("Serif", Font.BOLD, 20));
		
		this.add(stdntSignIn);
		this.add(stdntLogIn);
		this.add(admin);
		
		stdntSignIn.setActionCommand("SignIn");
		stdntSignIn.addActionListener(this);
		stdntLogIn.setActionCommand("stdntlogIn");
		stdntLogIn.addActionListener(this);
		admin.setActionCommand("admin");
		admin.addActionListener(this);
		
		this.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="SignIn"){
			new StudentSignInSwing();
			//this.setVisible(false);
		}
		    
		else if(e.getActionCommand()=="admin"){
			new AdminLogin();
			//this.setVisible(false);
		}
		else if (e.getActionCommand()=="stdntlogIn"){
			new StudentLogIn();
			//this.setVisible(false);

		}
			
	}

}
