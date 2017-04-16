package com.sd.address.v0;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class AddressGUIMain implements ActionListener{
  AddressData ad = new AddressData();
  AddressBook adb;
  
  String myName;
  String myNum; 
  String myId; 
  String myEmail;
  
  JTextField name = new JTextField(5);
  JTextField num = new JTextField(5);
  JTextField id = new JTextField(5);
  JTextField email = new JTextField(5);
  
  JButton b1;
  JButton b2;
  JButton b3;
  
  public static void main(String[] args){
    AddressGUIMain adGUI = new AddressGUIMain();
    adGUI.openGUI();
  }
    
  public void openGUI(){
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(4,2));
    JPanel panel2 = new JPanel(new GridLayout(1,3));
    
    f.getContentPane().add(panel,"North");
    f.getContentPane().add(panel2,"South");
    
    JLabel label1 = new JLabel("�̸�");
    JLabel label2 = new JLabel("��ȭ��ȣ");
    JLabel label3 = new JLabel("�й�");
    JLabel label4 = new JLabel("�̸���");
    
    b1 = new JButton("���");
    b2 = new JButton("����");
    b3 = new JButton("�ּҷ� �ҷ�����(�й���)");
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    
    panel.add(label1);
    panel.add(name);
    panel.add(label2);
    panel.add(num);
    panel.add(label3);
    panel.add(id);
    panel.add(label4);
    panel.add(email);
    
    panel2.add(b1);
    panel2.add(b2);
    panel2.add(b3);
    f.pack();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == b1){      
      adb = new AddressBook(ad);
      System.out.println("��ϵǽ��ϴ�.");
      
      myName = name.getText();
      myNum = num.getText();
      myId = id.getText();
      myEmail = email.getText();
      
      ad.setAddressData(myName,myNum,myId,myEmail);
      
      name.setText("");
      num.setText("");
      id.setText("");
      email.setText("");      
      
    }else if(e.getSource() == b2){
      ad.removeObserver(adb);
    }else{
      ad.display();
    }    
  }
  
}