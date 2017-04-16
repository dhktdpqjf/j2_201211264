package com.sd.address.v0;

public class AddressBook implements Observer{ 
  String name;
  String num; 
  String id; 
  String email;
  
  Observable ad;
  
  public AddressBook(Observable ad){
    this.ad = ad;
    ad.registerObserver(this);
  }
  
  public void update(String name, String num, String id, String email){
    this.name = name;
    this.num = num;
    this.id = id;
    this.email = email;
    //display();
  }
  /*
  public void display(){
    System.out.println("이름: "+name+"\t 전화번호: "+num+" 학번: "
                         +id+"\t 이메일: " + email);
  }*/
  
}