package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.Observable;
import java.util.Observer;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;


public class BabyTurtle extends Observable{
  Turtle baby = new Turtle(); //BabyTurtle은 Turtle을 상속하는 것이 아니라 연관관계이기 때문에 Turtle이 가진 모든 속성과 함수를 물려받는 게 아니라 필요한 것만 가져다가 쓰면 됨.
  ArrayList<Observer> obs = new ArrayList<Observer>();
  Double myCurpos =  baby.getPos();
  
  public BabyTurtle(){
    baby.setColor("blue");
    baby.label("Baby goes");
  }
  
  public void addObserver(Observer o){
    obs.add(o);
  }
  
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this,"hello");
  }
  
  protected void setChanged(){
    myCurpos = baby.getPos();
    //notifyObservers();  //하고 여기서 불러도 되는데 main함수에서 부르기로!
  }
  
  public void move(int x, int y){
    baby.moveTo(x,y);
  }
}
  
  
  