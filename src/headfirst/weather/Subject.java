package headfirst.observer.weather;

public interface Subject{
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObserver();//observer였는데 s를 붙여서 다 알려주는 걸로
  
} 