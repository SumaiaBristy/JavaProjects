package comm.example;

public class MyChar implements Runnable {
	private char[] alph;

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		alph=new char[26];
		insert();
		
	}
	public void insert()
	{
		
		for(int i=0;i<16;i++)
		{
			
			alph[i]=(char)('A'+i);
			System.out.println("item inserted: "+alph[i]);
			if(i==10){
				System.out.print("entering sleep mode: "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(10000);
				
			}
			catch(InterruptedException e)
			{
				
				e.printStackTrace();
			}
		}
		}
	}
	

}
