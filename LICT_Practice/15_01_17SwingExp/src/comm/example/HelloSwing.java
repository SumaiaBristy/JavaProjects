package comm.example;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloSwing extends JFrame{
	
	
	//ekhon sob component gulake variable hisebe nibo
	private JTextField t1=null;
	private JLabel l1=null,l2=null;
	private JButton b1=null;

	public HelloSwing() {
		super(); //super means frame er constructor k call korbe
		this.setSize(400,400);
		l1=new JLabel("Enter your name: ");
		t1=new JTextField(20);
		b1=new JButton("hello");
		this.setLayout(new FlowLayout()); //basic layout manager flowlayout means ektar por ekta add hobe component gula
		this.add(l1); //this means current class er object
		this.add(t1);
		this.add(b1);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new HelloSwing();
	}

}