package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MyRemoteImpl extends UnicastRemoteObject implements I_MyRemote {
	
	public MyRemoteImpl() throws RemoteException{}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Server says, Hey!";
	}
	
	public static void main(String[] args){
		
		try{
			I_MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	

}
