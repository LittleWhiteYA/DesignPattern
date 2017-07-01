package observer_pattern;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		Observer_1 observer1 = new Observer_1(weatherData);
		Observer_2 observer2 = new Observer_2(weatherData);
		
		weatherData.measurementChanged(80, 65, 30.4f);
		weatherData.measurementChanged(82, 70, 29.2f);

	}

}
