public class armstrong
{

	public static void main(String args[])
    {
         // Scanner in = new Scanner(System.in);

		int i=153,j,k,l,m,n,r;
		// i = in.nextInt();
		l=0;
		n=i;
		while(n>0)
		{
			r=n%10;
			l+=(r*r*r);
			n/=10;


		}
		if(l==i)
			System.out.println(l+" is armstrong number");
			else System.out.println(i+" is not armstrong number as found result "+l);


	}


}