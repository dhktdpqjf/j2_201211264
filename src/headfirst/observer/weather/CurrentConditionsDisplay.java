package headfirst.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temp;
  
  public CurrentConditionsDisplay(Subject w){
    this.weatherData =w;
  }
  /*¼÷Á¦
  StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
  ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
*/
  
  public void update(float temp, float humidity, float pressure){
    this.temperature= temp;
  }
  public void display(){
    
  }
}
  
  