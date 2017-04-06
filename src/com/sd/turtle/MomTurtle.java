package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;
import java.awt.geom.Point2D.Double;

public class MomTurtle extends Turtle implements Observer{
  Double babyCurpos; //double�� wrapperclass��. ��� (x,y)�� ������.
  
  public MomTurtle(){
    setColor("yellow");
    label("Mommy follows");
  }
  
  public void update(Observable o, Object arg){
    //Object arg�� ����, ���� �� �������. ����Ʈ���൵ �ǰ� �� �ص� ��. ���ǹ�
    System.out.println("updated");
    babyCurpos = ((BabyTurtle)o).myCurpos;
    moveTo(babyCurpos);//moveTo�� Turtle�� �ִ� ��.
  }  
}
    