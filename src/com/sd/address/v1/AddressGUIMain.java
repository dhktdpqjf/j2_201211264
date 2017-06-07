package com.sd.address.v1;
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
       
       JLabel label1 = new JLabel("이름"); 
       JLabel label2 = new JLabel("전화번호"); 
       JLabel label3 = new JLabel("학번"); 
       JLabel label4 = new JLabel("이메일"); 
       
       b1 = new JButton("등록"); 
       b2 = new JButton("불러오기");
       b3 = new JButton("학번으로 검색");
       b4 = new JButton("수정"); 
       b5 = new JButton("삭제"); 
       
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
           myId = Integer.parseInt(JOptionPane.showInputDialog(null, "반드시 입력해야합니다."));
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
           myId = Integer.parseInt(JOptionPane.showInputDialog(null, "반드시 입력해야합니다."));
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
         /*등록하기
         <기능>
         아이디는 not null 옵션이기 때문에 미입력 시 경고
         중복된 아이디가 존재하면 경고
           */
         warning = "이미 존재하는 아이디입니다. 다시 입력해주세요.";
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
         
         System.out.println("등록되습니다.");     
         
       }else if(e.getSource() == b2){ 
         //전체자료 불러오기
         System.out.println("---------------------------------LIST------------------------------------");
         personDAOImpl = new PersonDAOImpl();
         findAllCommand allCommand = new findAllCommand(personDAOImpl);
         remote.setCommand(allCommand);
         remote.buttonWasPressed();
         System.out.println("----------------------------------------------------------------------------");
                  
       }else if(e.getSource() == b3){ 
         /* id로 검색   
          <기능>
          존재하지 않는 아이디일 시 알림창
           */
         
         if(id.getText().equals("")){
           myId = Integer.parseInt(JOptionPane.showInputDialog(null, "학번을 입력하세요."));
         }  else {
           myId = Integer.parseInt(id.getText());
         }
         
         personDAOImpl = new PersonDAOImpl();
         findByIdCommand idCommand = new findByIdCommand(personDAOImpl,myId);
         remote.setCommand(idCommand);
         remote.buttonWasPressed();
                
         
       }else if(e.getSource() == b4){ 
         /* 수정
         입력받은 아이디에 따라 수정. 
         <기능>
         아이디를 입력하지 않았을 시에 경고 메시지.
         등록되지 않은 아이디일 시에 없는 아이디라고 경고메시지
         */
         warning = "수정할 아이디가 없습니다. 다시 입력해주세요.";
         findUpdateId();
         
         myName = "(updated)" + name.getText(); 
         myNum = "(updated)" + num.getText(); 
         myEmail = "(updated)" + email.getText();
         
         person.setName(myName);
         person.setNum(myNum);
         person.setId(myId);
         person.setEmail(myEmail);
         
         personDAOImpl.update(person);
         
         //System.out.println("수정되었습니다.");
        
       }else {
        /*삭제         
        <예외처리>
          존재하지 않는 아이디일 시에 경고창
        */
         warning = "삭제할 아이디가 없습니다. 다시 입력해주세요.";
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
