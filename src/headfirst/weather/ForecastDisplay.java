package headfirst.observer.weather;

public class ForecastDisplay implements Observer,DisplayElement{
  float avgt=0,temperature;
  WeatherData wd;
  String msg;
  
  /* StatisticsDisplay에서 통계값을 가져와 
   * 평균값과 가장 최근값의 평균을 구해서 표시
*/
  
  public ForecastDisplay(Subject w){
    this.wd = (WeatherData)w;
    wd.registerObserver(this);
    this.avgt = wd.tot/wd.cnt;
    this.temperature = wd.temperature;
    if(avgt > temperature)
      msg = "기온이 더 낮겠습니다";
    if(avgt < temperature)
      msg = "기온이 좀 더 높겠습니다.";
    display();
  }
  
  public void update(float temp, float humidity, float pressure){
    this.temperature = temp;
  }
  public void display(){
    System.out.println(msg);
  }
  
}