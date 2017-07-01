package observer_pattern;

public interface Observer {
	public void update(float temp, float humid, float press);
	public void display();
}
