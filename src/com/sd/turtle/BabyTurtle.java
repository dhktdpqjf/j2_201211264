package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.Observable;
import java.util.Observer;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;


public class BabyTurtle extends Observable{
  Turtle baby; //BabyTurtle�� Turtle�� ����ϴ� ���� �ƴ϶� ���������̱� ������ Turtle�� ���� ��� �Ӽ��� �Լ��� �����޴� �� �ƴ϶� �ʿ��� �͸� �����ٰ� ���� ��.
  ArrayList<Observer> obs;
  Double myCurpos;
  
  public void addObserver(Observer o){
    obs.add(o);
  }
  
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this, "updated");
  }
  
  protected void setChanged(){
    myCurpos = baby.getPos();
    //notifyObservers();  //�ϰ� ���⼭ �ҷ��� �Ǵµ� main�Լ����� �θ����!
  }
  
  public void move(int x, int y){
    baby.moveTo(x,y);
  }
}
  
  
  