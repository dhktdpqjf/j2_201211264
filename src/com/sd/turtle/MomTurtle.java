package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;
import java.awt.geom.Point2D.Double;

public class MomTurtle extends Turtle implements Observer{
  Double babyCurpos; //double의 wrapperclass임. 얘는 (x,y)의 형태임.
  
  public MomTurtle(){
    setColor("yellow");
    label("Mommy follows");
  }
  
  public void update(Observable o, Object arg){
   
    System.out.println("updated");
    babyCurpos = ((BabyTurtle)o).myCurpos;
    moveTo(babyCurpos);//moveTo는 Turtle에 있는 애.
  }  
}
    
