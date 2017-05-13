public class SwitchDemo
{

	public static void main(String args[])
    {

		char c='r';
		char choice=Character.toUpperCase(c);
		switch(choice)
		{
			case 'R':
			System.out.println("Color is red!!");
			break;
			case 'G':
			System.out.println("Color is green!!");
			break;
			case 'B':
			System.out.println("Color is blue!!");
			break;
			default:
			System.out.println("invalid color code!!");
			//default er seshe break dte hbe na cz kno case print nahole default ta print hbe
			//joto besi case likha hbe program slow hoye jabe
		}

	}



}