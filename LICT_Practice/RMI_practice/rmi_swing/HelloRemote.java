import java.rmi.*;
import java.rmi.server.*;
public class HelloRemote extends UnicastRemoteObject implements hello
{

HelloRemote() throws RemoteException
{
super();
}


public String return_a_string(String ss){
return ss;
}

}