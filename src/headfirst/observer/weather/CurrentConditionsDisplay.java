package headfirst.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  Subject weatherData;
  
  public CurrentConditionsDisplay(Subject w){
    this.weatherData =w;
    weatherData.registerObserver(this);
  }
  
  public void update(float temperature , float humidity, float pressure){
    this.temperature= temperature;
    this.humidity = humidity;
    display();
  }
  public void display(){
    System.out.println("Current conditions: " + temperature 
   + "F degrees and " + humidity + "% humidity");
  }
}
  
  