package comm.example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HelloSwing extends JFrame implements ActionListener{
	 Customer c=new Customer();
	//private List<Customer> list=null;
	//OracleConnectionFactory factory=null;
	
	 PreparedStatement pStatement=null;
		private Connection con=null;
		
	private JTextField t1=null,t2=null,t3=null,t4=null;
	private JLabel l1=null,l2=null,l3=null,l4=null,l5=null;
	private JButton b1=null,b2=null;
	private JTextArea a1=null;
	public HelloSwing() {
		super(); //super means frame er constructor k call korbe
		//list=new ArrayList<Customer>();
		this.setSize(400,400);
		
		l1=new JLabel("Enter your id: ");
		t1=new JTextField(20);
		
		l2=new JLabel("First Name: ");
		t2=new JTextField(25);
		
		l3=new JLabel("Last Name: ");
		t3=new JTextField(25);
		
		l4=new JLabel("Amount: ");
		t4=new JTextField(25);
		
		b1=new JButton("Insert Data");
		b2=new JButton("Show Data");
		l5=new JLabel();
		//a1=new JTextArea(2,20);
	
		this.setLayout(new FlowLayout()); //basic layout manager flowlayout means ektar por ekta add hobe component gula
		this.add(l1); //this means current class er object
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(l3);
		this.add(t3);
		this.add(l4);
		this.add(t4);
		this.add(b1); //ekahne button hcche source karon button e click krlei kaj hcche jeta listener listen korbe
		this.add(b2);
		this.add(l5);
		b1.addActionListener(this); //button k bole dcchi listener er mddhe listen korate
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		
		new HelloSwing();
	
	}
		//new HelloSwing();

	@Override
	public void actionPerformed(ActionEvent e) { //button e click krlei actionEvent type er eka object create hbe
		//l2.setText("Hello..."+t1.getText().toString()); //alwys object get kore tai string e convert krte hbe tostrig diye
		
		c.setId(Integer.parseInt(t1.getText()));
		c.setFirstname(t2.getText().toString());
		c.setLastname(t3.getText().toString());
		c.setAmount(Double.parseDouble(t4.getText()));
		//l5.setText("Hello "+t.getText().toString());
		//JOptionPane.showMessageDialog(b1,c);
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		
		System.out.println("connection established");
		
		pStatement=con.prepareStatement("insert into CUSTOMER values(?,?,?,?)");
		pStatement.setInt(1,c.getId());
		pStatement.setString(2,c.getFirstname());
		pStatement.setString(3,c.getLastname());
		pStatement.setDouble(4,c.getAmount());
		int a=pStatement.executeUpdate();//execute update return korbe koita row insert hoise
		System.out.println(a+" row(s)"+" inserted succesfully!!!");
		}
		catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}

}
