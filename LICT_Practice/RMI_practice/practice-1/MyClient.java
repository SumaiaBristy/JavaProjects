import java.rmi.*;
import java.util.Scanner;
public class MyClient{
private static Scanner sc=new Scanner(System.in);
public static void main(String args[]){

try{
hello aa=(hello)Naming.lookup("rmi://localhost:5000/SAMPLE");
System.out.println("Enter the vaue of string");
String x=sc.next();

String sum=aa.return_a_string(x);
System.out.println("hello :......"+sum);



}
catch(Exception e)
{
   System.out.println(e);
}


}





}