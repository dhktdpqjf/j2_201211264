package com.sd.dao.v1;

public class Person { //실무에서는 추상클래스로 함, 또 저장할 데이터인지 아닌지에 대해 생각하기.
  private int id;
  private String name;
  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  //함수 잘 안 넣음. 넣어봤자 getter, setter만 넣음
  public String getName(){
    return name;
  }
  public void setName(String n){
    this.name = n;
  }
  public int getId(){
    return id;
  }
}
  