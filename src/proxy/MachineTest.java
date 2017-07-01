package proxy;

import java.rmi.Naming;

public class MachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 100;
		Machine machine = null;
		try {
			machine = new Machine("Tainan", count);
			Naming.rebind("//Tainan/Machine", machine);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MachineMonitor monitor = new MachineMonitor(machine);
		
		monitor.report();
	}

}
