package comm.example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class SwingExp  extends JFrame implements ActionListener {
	private JTextField t1=null;
	private JLabel l1=null,l2=null;
	private JButton b1=null;
	private JTextArea a1=null;
	//private RadioButtonBorder r1=null;
	
	public SwingExp() {
		super(); //super means frame er constructor k call korbe
	this.setSize(400,400);
	l1=new JLabel("Enter your name: ");
	l2=new JLabel();
	t1=new JTextField(20);
	b1=new JButton("hello");
	a1=new JTextArea(2,20);
	//r1=new RadioButtonBorder(null, null,null,null);
	this.setLayout(new FlowLayout()); //basic layout manager flowlayout means ektar por ekta add hobe component gula
	this.add(l1); //this means current class er object
	this.add(t1);
	this.add(b1); //ekahne button hcche source karon button e click krlei kaj hcche jeta listener listen korbe
	this.add(l2);
	b1.addActionListener(this); //button k bole dcchi listener er mddhe listen korate
	this.setVisible(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingExp();

	}

	@Override
	public void actionPerformed(ActionEvent e) { //button e click krlei actionEvent type er eka object create hbe
		l2.setText("Hello..."+t1.getText().toString()); //alwys object get kore tai string e convert krte hbe tostrig diye
		
	}

}
