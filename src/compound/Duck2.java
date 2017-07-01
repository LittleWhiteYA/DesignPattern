package compound;

public class Duck2 implements I_Quackable {
	Observable observable;
	
	public Duck2() {
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack 2");
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
