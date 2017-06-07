package com.sd.address.v1;
import java.util.List;
import java.util.Iterator;

public class findAllCommand implements Command{
    PersonDAO p;
    PersonVO person = new PersonVO();
    
    public findAllCommand(PersonDAOImpl p){
      this.p = p;
    }
    
    public void execute(){
      //p.findAll();
      List persons=p.findAll();
      Iterator iter = persons.iterator();
      while(iter.hasNext()) {
          person=(PersonVO)iter.next();
          System.out.println(person.toString());
      }
    }
}
