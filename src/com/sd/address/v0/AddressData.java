package com.sd.address.v0;

public class AddressData implements Observer{ 
  String name;
  String num; 
  String id; 
  String email;
  
  Observable ad;
  
  public AddressData(Observable ad){
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
    System.out.println("�̸�: "+name+"\t ��ȭ��ȣ: "+num+" �й�: "
                         +id+"\t �̸���: " + email);
  }*/
  
}