package comm.example;

public class Myclass implements Runnable{
	
	
	
	public void myMethod()
	{
		for(int i=0;i<=10000;i++)
		{
			System.out.println(Thread.currentThread()+": "+i); //here currentThred hcche static method cz class name dot diye access kora gese
	       
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		myMethod();
		/*for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread()+": "+i); //here currentThred hcche static method cz class name dot diye access kora gese
	       
		}*/
	}
		
	

}
