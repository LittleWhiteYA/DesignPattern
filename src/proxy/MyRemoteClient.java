package proxy;

import java.rmi.Naming;

public class MyRemoteClient {

	public static void main(String[] args){
		new MyRemoteClient().go();
	}
	
	public void go(){
		
		try{
			I_MyRemote service = (I_MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s = service.sayHello();
			System.out.println(s);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
