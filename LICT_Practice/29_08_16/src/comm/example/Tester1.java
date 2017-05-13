package comm.example;

import javax.swing.border.EmptyBorder;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EmployeeFactory factory=new EmployeeFactory();
     factory.createEmployees();
     factory.display();
     int arr[][]=new int[5][];//non-jagged; arr[][]=new int[5][6]//jagged
     
	}

}
