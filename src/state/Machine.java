package state;

public class Machine {
	
	I_State soldOutState;
	I_State noQuarterState;
	I_State hasQuarterState;
	I_State soldState;
	
	I_State state;
	int count = 0;
	public Machine(int balls_num){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = balls_num;
		if(balls_num > 0)
			state = noQuarterState;
		else
			state = soldOutState;
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrack();
		state.dispense();
	}
	
	void setState(I_State state){
		this.state = state;
	}
	
	void releaseBall(){
		System.out.println("A ball comes rolling out the slot...");
		if(count != 0){
			--count;
		}
	}
	
	I_State getSoldOutState(){
		return soldOutState;
	}
	
	I_State getSoldState(){
		return soldState;
	}
	
	I_State getNoQuarterState(){
		return noQuarterState;
	}
	
	I_State getHasQuarterState(){
		return hasQuarterState;
	}
	
	int getCount(){
		return count;
	}
}
