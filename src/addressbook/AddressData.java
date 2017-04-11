package addressbook;

import java.util.*;

public class AddressData implements Subject{
 private ArrayList<Observer> observers;
 protected String name;
 protected String num; 
 protected String address; 
 private int age;
 
 public AddressData(){
   observers = new ArrayList<Observer>();
 } 
 public void registerObserver(Observer o) {
   observers.add(o);
 } 
 public void removeObserver(Observer o){
   observers.remove(o);
 }
 
 public void notifyObservers(){
   for(int i =0; i<observers.size();i++){
     Observer observer = (Observer)observers.get(i);
     observer.update(name, num, address, age);
   }
 } 
 
 public void bookChanged() {
   notifyObservers();
 }  
 
 public void setAddressbook(String name, String num, String address, int age){
   this.name = name;
   this.num = num;
   this.address = address;
   this.age = age;  
   bookChanged();
 }
  
 /*
 public String getName(){
   return name;
 }
 
 public void setAddress(String s){
   address = s;
 }
 public void setNum(String s){
   num = s;
 }
 
 public String getNum(){
   return num;
 }
 public String getAddress(){
   return address;
 }
 public int getAge(){
   return age;
 } */
}
  