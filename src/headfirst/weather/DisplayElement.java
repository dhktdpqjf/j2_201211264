package headfirst.observer.weather;

public interface DisplayElement {//Observer
  public void update(float temp, float humidity, float pressure);
  public void display();
}