package compound;

public class GooseAdapter implements I_Quackable {
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
	}

	@Override
	public void registerObserver(I_Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nodifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
