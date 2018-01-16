package com.sd.dao.v1;
import java.util.List;

public interface PersonDao{ //테이블이 몇백개면 DAO도 몇백개가 됨.
                            //DAO는 Model이다. Model은 or-mapping을 함.
  //화면과 모델이 나누어져 있는 3계층 패턴이 MVC패턴임. 3계층은 화면에 sql문이 없는 것. 있는 거는 2계층.
  public void insert(Person p);
  public List<Person> findAll();
  public Person findById(int id);
  public void update(Person p);
  public void delete(int id);
  public void delete(Person p);
    
//    +insert(p:PersonVO):void
//    +findAll():List 
//    +findById(id:int):Person
//    +update(p:Person):void
//    +delete(id:int):void
//    +delete(p:Person):void 
      //planttext 바탕으로 작성
}
