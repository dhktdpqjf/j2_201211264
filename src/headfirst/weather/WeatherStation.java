package headfirst.observer.weather;

public class WeatherStation{
  public static void main(String[] args){
    WeatherData weatherData = new WeatherData();
 
  CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
  
  weatherData.setMeasurements(80.3f, 65.1f, 30.4f);
  weatherData.setMeasurements(82.2f, 70.9f, 29.2f);
  weatherData.setMeasurements(78.7f, 90.3f, 29.2f);
  
  //setMeasurements 이후에만 가능함
  StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
  ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

  }
}