package compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements I_Quackable {

	ArrayList<I_Quackable> quackers = new ArrayList<>();
	
	public void add(I_Quackable quacker){
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator<I_Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()){
			I_Quackable quacker = (I_Quackable)iterator.next();
			quacker.quack();
		}
		
	}

	@Override
	public void registerObserver(I_Observer observer) {
		// TODO Auto-generated method stub
		Iterator<I_Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()){
			I_Quackable quacker = (I_Quackable)iterator.next();
			quacker.registerObserver(observer);
		}
	}

	@Override
	public void nodifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
