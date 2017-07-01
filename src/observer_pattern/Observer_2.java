package observer_pattern;

public class Observer_2 implements Observer{
	private float temperature;
	private float humidity;
	private float pressure;
	private Data weatherData;
	
	Observer_2(Data w_Data)
	{
		weatherData = w_Data;
		weatherData.registerObserver(this);
	}
	
	
	@Override
	public void update(float temp, float humid, float press) {
		// TODO Auto-generated method stub
		temperature = temp;
		humidity = humid;
		pressure = press;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("2.");
		System.out.println("temp: " + temperature + ", humid: " + humidity + ", press: "+pressure);
	}
	
}
