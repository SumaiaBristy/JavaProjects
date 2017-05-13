import java.rmi.*;
import java.util.Scanner;
public class MyClient{
private static Scanner sc=new Scanner(System.in);
public static void main(String args[]){

try{
Adder aa=(Adder)Naming.lookup("rmi://localhost:5000/SAMPLE");
System.out.println("Enter the vaue of x:......");
int x=sc.nextInt();
System.out.println("Enter the vaue of y:......");
int y=sc.nextInt();
int sum=aa.add(x,y);
System.out.println("addition of "+x+ "and "+y+" is:......+"+sum);
//System.out.println(aa.add(34,134));


}
catch(Exception e)
{

}


}





}