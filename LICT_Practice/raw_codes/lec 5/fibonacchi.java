public class fibonacchi
{

	public static void main(String args[])
    {
		int i,j,k,l,m,n,x=0,y=1;
		System.out.println("0\n");
		for(;;)
		{
			m=x+y;
			if(m<=50)
			System.out.println(""+m+"\n");
			else break;
            y=x;
			x=m;


//System.out.println(" "+m+" "+y);
//break;

		}


     }




}