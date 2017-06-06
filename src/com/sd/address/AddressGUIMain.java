package com.sd.dao.v2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;
    
 public class AddressGUIMain implements ActionListener { 
     PersonDAOImpl personDAOImpl;
     PersonVO person ;
     SimpleRemoteControl remote = new SimpleRemoteControl();
          
     String myName=""; 
     String myNum="";  
     int myId;  
     String myEmail=""; 
     
     String warning="";
    
     JTextField name = new JTextField(20); 
     JTextField num = new JTextField(20); 
     //JTextField id = new JTextField("�ʼ��Է�",20); 
     JTextField id = new JTextField(20); 
     JTextField email = new JTextField(20); 
     
     JButton b1; 
     JButton b2; 
     JButton b3; 
     JButton b4; 
     JButton b5;    
      
     public void openGUI(){ 
       JFrame f = new JFrame(); 
       JPanel panel = new JPanel(new GridLayout(4,2)); 
       JPanel panel2 = new JPanel(new GridLayout(1,5)); 
       
       f.getContentPane().add(panel,"North"); 
       f.getContentPane().add(panel2,"South"); 
       
       JLabel label1 = new JLabel("�̸�"); 
       JLabel label2 = new JLabel("��ȭ��ȣ"); 
       JLabel label3 = new JLabel("�й�"); 
       JLabel label4 = new JLabel("�̸���"); 
       
       b1 = new JButton("���"); 
       b2 = new JButton("�ҷ�����");
       b3 = new JButton("�й����� �˻�");
       b4 = new JButton("����"); 
       b5 = new JButton("����"); 
       
       b1.addActionListener(this); 
       b2.addActionListener(this); 
       b3.addActionListener(this); 
       b4.addActionListener(this);
       b5.addActionListener(this); 
       
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
       panel2.add(b4); 
       panel2.add(b5);
       
       f.setSize(800,400);
       f.pack(); 
       f.setVisible(true); 
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     }
     
     public void findId(){
       personDAOImpl = new PersonDAOImpl();
       person = new PersonVO();
       if(id.getText().equals("")){
           myId = Integer.parseInt(JOptionPane.showInputDialog(null, "�ݵ�� �Է��ؾ��մϴ�."));
           while(personDAOImpl.checkId(myId))
             myId = Integer.parseInt(JOptionPane.showInputDialog(null, warning));
         }else {
           myId = Integer.parseInt(id.getText());
           while(personDAOImpl.checkId(myId))
             myId = Integer.parseInt(JOptionPane.showInputDialog(null, warning));
         }
     }
     
     public void findUpdateId(){
       personDAOImpl = new PersonDAOImpl();
       person = new PersonVO();
       if(id.getText().equals("")){
           myId = Integer.parseInt(JOptionPane.showInputDialog(null, "�ݵ�� �Է��ؾ��մϴ�."));
           while(!personDAOImpl.checkId(myId))
             myId = Integer.parseInt(JOptionPane.showInputDialog(null, warning));
         }else {
           myId = Integer.parseInt(id.getText());
           while(!personDAOImpl.checkId(myId))
             myId = Integer.parseInt(JOptionPane.showInputDialog(null, warning));
         }
     }
     
     
    
     public void actionPerformed(ActionEvent e) { 
       if(e.getSource() == b1){           
         /*����ϱ�
         <���>
         ���̵�� �̸��� not null �ɼ��̱� ������ ���Է� �� ���
         �ߺ��� ���̵� �����ϸ� ���
           */
         warning = "�̹� �����ϴ� ���̵��Դϴ�. �ٽ� �Է����ּ���.";
         findId();
         
         myName = "" + name.getText(); 
         myNum = "" + num.getText();          
         myEmail = "" + email.getText();  
         
         person.setName(myName);
         person.setNum(myNum);
         person.setId(myId);
         person.setEmail(myEmail);
         personDAOImpl.insert(person);
                  
         name.setText(""); 
         num.setText(""); 
         id.setText(""); 
         email.setText("");   
         
         System.out.println("��ϵǽ��ϴ�.");     
         
       }else if(e.getSource() == b2){ 
         //��ü�ڷ� �ҷ�����
         System.out.println("---------------------------------LIST------------------------------------");
         personDAOImpl = new PersonDAOImpl();
         findAllCommand allCommand = new findAllCommand(personDAOImpl);
         remote.setCommand(allCommand);
         remote.buttonWasPressed();
         System.out.println("----------------------------------------------------------------------------");
                  
       }else if(e.getSource() == b3){ 
         /* id�� �˻�   
          <���>
          �������� �ʴ� ���̵��� �� �˸�â
           */
         
         if(id.getText().equals("")){
           myId = Integer.parseInt(JOptionPane.showInputDialog(null, "�й��� �Է��ϼ���."));
         }  else {
           myId = Integer.parseInt(id.getText());
         }
         
         personDAOImpl = new PersonDAOImpl();
         findByIdCommand idCommand = new findByIdCommand(personDAOImpl,myId);
         remote.setCommand(idCommand);
         remote.buttonWasPressed();
                
         
       }else if(e.getSource() == b4){ 
         /* ����
         �Է¹��� ���̵� ���� ����. 
         <���>
         ���̵� �Է����� �ʾ��� �ÿ� ��� �޽���.
         ��ϵ��� ���� ���̵��� �ÿ� ���� ���̵��� ���޽���
         */
         warning = "������ ���̵� �����ϴ�. �ٽ� �Է����ּ���.";
         findUpdateId();
         
         myName = "(updated)" + name.getText(); 
         myNum = "(updated)" + num.getText(); 
         myEmail = "(updated)" + email.getText();
         
         person.setName(myName);
         person.setNum(myNum);
         person.setId(myId);
         person.setEmail(myEmail);
         
         personDAOImpl.update(person);
         
         //System.out.println("�����Ǿ����ϴ�.");
        
       }else {
        /*����         
        <����ó��>
          �������� �ʴ� ���̵��� �ÿ� ���â
        */
         warning = "������ ���̵� �����ϴ�. �ٽ� �Է����ּ���.";
         findUpdateId();
         
         personDAOImpl.delete(myId);
         name.setText(""); 
         num.setText(""); 
         id.setText(""); 
         email.setText("");          
       }
     
     }
      
     public static void main(String[] args){ 
       AddressGUIMain adGUI = new AddressGUIMain(); 
       adGUI.openGUI(); 
     } 
    
 } 
