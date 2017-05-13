package comm.example;

public class joinExp implements Runnable{
	private int i=0;
	public joinExp()
	{
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(i<3000)
		{
			
			System.out.println(Thread.currentThread().getName()+": "+i);
			/*if(i==100)
			{
				
				break;
			}*/
			i++;
		}
		
	}

}
