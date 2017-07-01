package observer_pattern;

public interface Data {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void nodifyObserver();
}
