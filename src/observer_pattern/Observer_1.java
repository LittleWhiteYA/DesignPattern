package observer_pattern;

public class Observer_1 implements Observer{
	private float temperature;
	private float humidity;
	private float pressure;
	private Data weatherData;
	
	public Observer_1(Data w_Data)
	{
		weatherData = w_Data;
		weatherData.registerObserver(this);
	}
	
	public void update(float temp, float humid, float press)
	{
		temperature = temp;
		humidity = humid;
		pressure = press;
		display();
	}
	
	public void display()
	{
		System.out.println("1.");
		System.out.println("temp: " + temperature + ", humid: " + humidity + ", press: "+pressure);
	}
}
