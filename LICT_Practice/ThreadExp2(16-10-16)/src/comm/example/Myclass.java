package comm.example;

public class Myclass implements Runnable{
	int i;
	public void run()
	{
         int i;
		
			
			i=0;
			while(true)
			{
				System.out.println("Hello "+ i++);
				if(i==50) break;
				
			}
		}
	}


