package state;

public class MachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine = new Machine(5);
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine);
	}

}
