package proxy;

public class HasQuarterState implements I_State {

	Machine machine;
	
	public HasQuarterState(Machine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter returned");
		machine.setState(machine.getNoQuarterState());
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("You turned...");
		machine.setState(machine.getSoldState());
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No ball dispensed");
	}

}
