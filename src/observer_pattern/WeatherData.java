package observer_pattern;

import java.util.ArrayList;

public class WeatherData implements Data {
	private ArrayList<Observer> observers;
	private float temp;
	private float humid;
	private float press;
	
	public WeatherData()
	{
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}
	
	public void removeObserver(Observer o)
	{
		observers.remove(o);
	}
	
	public void nodifyObserver()
	{
		for(int i=0; i<observers.size(); ++i)
		{
			Observer observer = observers.get(i);
			observer.update(temp, humid, press);
		}
	}
	
	public void measurementChanged(float temperature, float humidity, float pressure)
	{
		temp = temperature;
		humid = humidity;
		press = pressure;
		nodifyObserver();
	}
}
