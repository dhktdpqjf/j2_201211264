package headfirst.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
  
 private ArrayList<Observer> observers;//Array�� ũ�Ⱑ ���ѵǾ� �־ index����̶� �� ��.
 private float temperature;
 private float humidity;
 private float pressure;
 
 public void registerObserver(Observer o) {
  observers.add(o);
 } 
 public void removeobserver(Observer o){
   observers.remove(o);
 }
 public void notifyObserver(){
   for(int i =0; i<observers.size();i++){
     Observer observer = (Observer)observers.get(i);
     observer.update(temperature, humidity, pressure);
   }
 }
 
 public void measurementsChanged() {
  notifyObservers();
 } 
 public void setMeasurements(float temperature, float humidity, float pressure) {
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