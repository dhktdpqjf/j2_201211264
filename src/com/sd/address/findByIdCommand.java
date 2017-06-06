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
        JOptionPane.showMessageDialog(null,"검색할 아이디가 없습니다. 다시 입력해주세요.");
      else
        System.out.println(person.toString());
    }
}