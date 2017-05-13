package comm.example;

public class MyArray {
	
	private char letter[];

	public MyArray() {
		super();
		
		letter=new char[26];
		for(int i=0;i<26;i++)
		{
			
			letter[i]=(char)('A' +(char)i);
					
		}
		for(char c:letter)//here letter array
		{
			
			System.out.print(","+c);
		}
	}
	

}
