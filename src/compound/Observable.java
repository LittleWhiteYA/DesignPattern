package compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements I_QuackObservable {
	ArrayList<I_Observer> observers = new ArrayList<>();
	I_QuackObservable duck;
	
	public Observable(I_QuackObservable duck) {
		// TODO Auto-generated constructor stub
		this.duck = duck;
	}

	@Override
	public void registerObserver(I_Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void nodifyObservers() {
		// TODO Auto-generated method stub
		Iterator<I_Observer> iterator = observers.iterator();
		while(iterator.hasNext()){
			I_Observer observer = (I_Observer)iterator.next();
			observer.update(duck);
		}
	}

}
