package com.sd.dao.v1;

public class Person { //�ǹ������� �߻�Ŭ������ ��, �� ������ ���������� �ƴ����� ���� �����ϱ�.
  private int id;
  private String name;
  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  //�Լ� �� �� ����. �־���� getter, setter�� ����
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
  