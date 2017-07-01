package proxy;

import java.rmi.RemoteException;

public class MachineMonitor {
	
	MachineRemote machine;
	
	public MachineMonitor(MachineRemote machine){
		this.machine = machine;
	}
	
	public void report(){
		try {
			System.out.println("Machine: "+machine.getLocation());
			System.out.println("Current inventory: "+machine.getCount());
			System.out.println("Current state: "+machine.getState());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
