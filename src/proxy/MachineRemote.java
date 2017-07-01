package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MachineRemote extends Remote {
	
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public I_State getState() throws RemoteException; 

}
