package com.sd.dao.v2;
import java.util.List;
import java.util.Iterator;
import javax.swing.*;

public class findByIdCommand implements Command{
    PersonDAO p;
    PersonVO person = new PersonVO();
    int myId;
    
    public findByIdCommand(PersonDAOImpl p,int id){
      this.p = p;
      this.myId = id;
    }
    
    public void execute(){  
      person = p.findById(myId); 
      
      if(person == null)
        JOptionPane.showMessageDialog(null,"�˻��� ���̵� �����ϴ�. �ٽ� �Է����ּ���.");
      else
        System.out.println(person.toString());
    }
}