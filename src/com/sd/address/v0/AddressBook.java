package com.sd.address.v0;
import java.util.ArrayList;

public class AddressBook implements Observable{
 ArrayList<Observer> observers;
 String name;
 String num; 
 String id; 
 String email;
 
 public AddressBook(){
   observers = new ArrayList<Observer>();
 } 
 public void registerObserver(Observer o) {
   observers.add(o);
 } 
 public void removeObserver(Observer o){
   int i = observers.indexOf(o);
   if (i >= 0) {
     observers.remove(i);
     System.out.println("삭제되었습니다.");     
   }else
     System.out.println("모두 삭제되었습니다.");
 }
 
 public void notifyObservers(){
   for(int i =0; i<observers.size();i++){
     Observer observer = (Observer)observers.get(i);
     observer.update(name, num, id, email);
   }
 } 
 
 public void bookChanged() {
   notifyObservers();
 }  
 
 public void setAddressBook(String name, String num, String id, String email){
   this.name = name;
   this.num = num;
   this.id = id;
   this.email = email;  
   bookChanged();
 } 
 public void display(){
   for(int i = 0; i<observers.size(); i++){
     Object obj = observers.get(i);
     System.out.println(obj);
   }
 }
}
  