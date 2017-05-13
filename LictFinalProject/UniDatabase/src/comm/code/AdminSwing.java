package comm.code;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AdminSwing extends JFrame implements ActionListener{
	private JButton searchButton= new JButton("Search by ID");
	private JButton seeDatabase=new JButton("View Database");
	private JLabel welcome= new JLabel("Welcome Admin");
	public AdminSwing() throws HeadlessException {
		super();
		this.setSize(300,200);
		this.setLayout(new FlowLayout());
		
		this.add(welcome);
		this.add(searchButton);
		this.add(seeDatabase);
		
		searchButton.setActionCommand("search");
		searchButton.addActionListener(this);
		
		seeDatabase.setActionCommand("see");
		seeDatabase.addActionListener(this);
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="search")
			new SearchSwing();
		else if(e.getActionCommand()=="see")
			JOptionPane.showMessageDialog(seeDatabase, "This page is Under Construction!!!...:(");
	}
	
	

}
