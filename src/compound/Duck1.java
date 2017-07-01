package compound;

public class Duck1 implements I_Quackable {
	Observable observable;
	
	public Duck1() {
		// TODO Auto-generated constructor stub
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack 1");
		nodifyObservers();
	}

	@Override
	public void registerObserver(I_Observer observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void nodifyObservers() {
		// TODO Auto-generated method stub
		observable.nodifyObservers();
	}

}
