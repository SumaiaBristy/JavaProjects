package comm.example;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		joinExp j1=new joinExp();
		Thread t1=new Thread(j1);
		t1.start();
		System.out.println(t1.isAlive());
		joinExp j2=new joinExp();
		Thread t2=new Thread(j1);
		t2.start();
		System.out.println(t2.isAlive());
		try {
			t1.join();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());
	}

}
