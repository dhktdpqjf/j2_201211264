package com.sd.dao.v1;
import java.util.List;

public interface PersonDao{ //���̺��� ��鰳�� DAO�� ��鰳�� ��.
                            //DAO�� Model�̴�. Model�� or-mapping�� ��.
  //ȭ��� ���� �������� �ִ� 3���� ������ MVC������. 3������ ȭ�鿡 sql���� ���� ��. �ִ� �Ŵ� 2����.
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
      //planttext �������� �ۼ�
}
