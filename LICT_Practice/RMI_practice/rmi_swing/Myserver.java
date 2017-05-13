import java.rmi.*;
import java.rmi.registry.*;
public class Myserver{

public static void main(String args[]){
try{

hello a=new HelloRemote();

Naming.rebind("rmi://localhost:5000/SAMPLE",a);
System.out.println("SErver Waiting and Ready....!");

}
catch(Exception e){System.out.println(e);}


}



}