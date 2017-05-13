import java.rmi.*;
public interface hello extends Remote
{
public String return_a_string(String ss) throws RemoteException;

}