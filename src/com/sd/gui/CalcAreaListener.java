package com.sd.gui;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalcAreaListener implements ActionListener{
  public void actionPerformed(ActionEvent e) {//ActionEvent�� ���� ���� ��.
    //System.out.println("hello");
    
    JButton b = (JButton)e.getSource();
    String cmd = e.getActionCommand();
    if(cmd.equals("���")){
      System.out.println("����ư");
      b.setText("Completed");
    } else if(cmd.equals("���")){
      System.out.println("��ҹ�ư");
      b.setText("Canceled");
    } else
      System.out.println("�ƹ��͵� �ƴ�");
    
  }  
}