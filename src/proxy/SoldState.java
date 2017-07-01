package proxy;

public class SoldState implements I_State {

	Machine machine;
	
	public SoldState(Machine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		machine.releaseBall();
		if(machine.getCount() > 0){
			machine.setState(machine.getNoQuarterState());
		}
		else{
			machine.setState(machine.getSoldOutState());
		}
			
	}

}
