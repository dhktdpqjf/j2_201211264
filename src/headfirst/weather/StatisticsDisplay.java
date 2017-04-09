package headfirst.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement{
  float avgt=0,maxt=0,mint=0;
  WeatherData wd;
  
  public StatisticsDisplay(Subject w){
    this.wd = (WeatherData)w;
    wd.registerObserver(this);
    this.avgt = wd.tot/wd.cnt;
    this.maxt = wd.maxt;
    this.mint = wd.mint;
    display();
  }
  public void update(float avg_temp , float max_temp, float min_temp){
    this.avgt = avg_temp;
    this.maxt = max_temp;
    this.mint = min_temp;
  }  
  public void display(){
    System.out.println("Average / Max / Min Temperature: " + avgt 
   + " / " + maxt + " / "+ mint);
  }
}
  