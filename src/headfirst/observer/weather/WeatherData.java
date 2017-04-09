package headfirst.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
  
 private ArrayList<Observer> observers;//Array�� ũ�Ⱑ ���ѵǾ� �־ index����̶� �� ��.
 float temperature; //�ٸ� ������ �����
 private float humidity;
 private float pressure;
 float tot=0,cnt=0,maxt=0,mint=100;
 
 public WeatherData(){
   observers = new ArrayList<Observer>();
 } 
 public void registerObserver(Observer o) {
  observers.add(o);
 } 
 public void removeObserver(Observer o){
   observers.remove(o);
 }
 public void notifyObserver(){
   for(int i =0; i<observers.size();i++){
     Observer observer = (Observer)observers.get(i);
     observer.update(temperature, humidity, pressure);
   }
 } 
 public void measurementsChanged() {
  notifyObserver();
 }  
 
 public void setMeasurements(float temperature, float humidity, float pressure) {
  
  tot += temperature;  cnt ++;
  while(mint>temperature){
    mint=temperature;
    break;
  }  
  while(maxt<temperature){
    maxt=temperature;
    break;
  }
  
  this.temperature = temperature;
  this.humidity = humidity;
  this.pressure = pressure;
  measurementsChanged();
 } 
 
 public float getTemperature() {
  return temperature;
 } 
 public float getHumidity() {
  return humidity;
 } 
 public float getPressure() {
  return pressure;
 }
}