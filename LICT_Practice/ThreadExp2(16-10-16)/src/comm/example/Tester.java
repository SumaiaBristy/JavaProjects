package comm.example;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Myclass c=new Myclass();
		Thread t=new Thread(c);
		t.start();
*/
		
		MyChar c1=new MyChar();
		Thread t1= new Thread(c1);
		t1.start();
		MyChar c2=new MyChar();
		Thread t2= new Thread(c2);
		t2.start();
		MyChar c3=new MyChar();
		Thread t3= new Thread(c3);
		t3.start();
		
	}

}
