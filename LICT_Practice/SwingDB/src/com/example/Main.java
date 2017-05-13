package com.example;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Customer DB");

		frame.setSize(300, 300);
		frame.setLayout(new GridLayout(5, 2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel idLabel = new JLabel("Customer ID:");
		JLabel fnameLabel = new JLabel("First name");
		JLabel lnameLabel = new JLabel("Last name");
		JLabel amountLabel = new JLabel("Amount");

		JTextField idTxt = new JTextField();
		JTextField fnameTxt = new JTextField();
		JTextField lnameTxt = new JTextField();
		JTextField amountTxt = new JTextField();

		JButton insertBtn = new JButton("Insert");
		JButton dispBtn = new JButton("Display");

		frame.add(idLabel);
		frame.add(idTxt);
		frame.add(fnameLabel);
		frame.add(fnameTxt);
		frame.add(lnameLabel);
		frame.add(lnameTxt);
		frame.add(amountLabel);
		frame.add(amountTxt);
		frame.add(insertBtn);
		frame.add(dispBtn);

		insertBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				int id = Integer.parseInt(idTxt.getText());
				String fname = fnameTxt.getText();
				String lname = lnameTxt.getText();
				float amount = Float.parseFloat(amountTxt.getText());

				Customer customer = new Customer(id, fname, lname, amount);

				try
				{
					int ret = new CustomerOperation().insertData(customer);
					JOptionPane.showMessageDialog(frame, ret + " rows inserted");

				} catch (SQLException ex)
				{
					ex.printStackTrace();
				}
			}
		});

		dispBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				List<Customer> list = null;
				try
				{
					list = new CustomerOperation().getAllData();
				} catch (SQLException ex)
				{
					ex.printStackTrace();
				}

				JFrame frameTbl = new JFrame("Customer Data");
				frameTbl.setSize(300, 300);
				frameTbl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JTable table = new JTable(new DefaultTableModel(new Object[] { "ID", "FName", "LName", "Amount" }, 0));

				frameTbl.add(new JScrollPane(table));

				DefaultTableModel model = (DefaultTableModel) table.getModel();

				for (Customer c : list)
				{
					model.addRow(new Object[] { c.getId(), c.getFirstName(), c.getLastName(), c.getAmount() });
				}

				frameTbl.setVisible(true);

			}
		});

		frame.setVisible(true);

	}

}
