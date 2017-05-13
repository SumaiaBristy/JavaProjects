package comm.example;

public class Tester {

	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass c1=new Myclass();
		Thread t1=new Thread(c1);
		t1.start();
		Myclass c2=new Myclass();
		Thread t2=new Thread(c2);
		
		t2.start();

	}

}
