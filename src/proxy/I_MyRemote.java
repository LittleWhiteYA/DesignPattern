package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface I_MyRemote extends Remote {
	
	public String sayHello() throws RemoteException;
}
