package compound;

public interface I_QuackObservable {
	public void registerObserver(I_Observer observer);
	public void nodifyObservers();

}
