package com.sd.gui;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalcAreaListener implements ActionListener{
  public void actionPerformed(ActionEvent e) {//ActionEvent가 뭔지 아직 모름.
    //System.out.println("hello");
    
    JButton b = (JButton)e.getSource();
    String cmd = e.getActionCommand();
    if(cmd.equals("계산")){
      System.out.println("계산버튼");
      b.setText("Completed");
    } else if(cmd.equals("취소")){
      System.out.println("취소버튼");
      b.setText("Canceled");
    } else
      System.out.println("아무것도 아님");
    
  }  
}