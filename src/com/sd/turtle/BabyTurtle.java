package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.Observable;
import java.util.Observer;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;


public class BabyTurtle extends Observable{
  Turtle baby = new Turtle(); 
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
  }
  
  public void move(int x, int y){
    baby.moveTo(x,y);
  }
}
  
  
  
