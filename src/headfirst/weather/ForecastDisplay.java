package headfirst.observer.weather;

public class ForecastDisplay implements Observer,DisplayElement{
  float avgt=0,temperature;
  WeatherData wd;
  String msg;
  
  /* StatisticsDisplay���� ��谪�� ������ 
   * ��հ��� ���� �ֱٰ��� ����� ���ؼ� ǥ��
*/
  
  public ForecastDisplay(Subject w){
    this.wd = (WeatherData)w;
    wd.registerObserver(this);
    this.avgt = wd.tot/wd.cnt;
    this.temperature = wd.temperature;
    if(avgt > temperature)
      msg = "����� �� ���ڽ��ϴ�";
    if(avgt < temperature)
      msg = "����� �� �� ���ڽ��ϴ�.";
    display();
  }
  
  public void update(float temp, float humidity, float pressure){
    this.temperature = temp;
  }
  public void display(){
    System.out.println(msg);
  }
  
}