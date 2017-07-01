package compound;

public class QuackCounter implements I_Quackable {

	I_Quackable duck;
	static int quack_num;
	
	public QuackCounter(I_Quackable duck) {
		// TODO Auto-generated constructor stub
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		++quack_num;
	}
	
	public static int getQuacks(){
		return quack_num;
	}

	@Override
	public void registerObserver(I_Observer observer) {
		// TODO Auto-generated method stub
		duck.registerObserver(observer);
	}

	@Override
	public void nodifyObservers() {
		// TODO Auto-generated method stub
		duck.nodifyObservers();
	}
	
	
}
