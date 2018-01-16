package com.sd.dao.v1;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
  List<Person> persons;
  
  public PersonDaoImpl(){
    persons = new ArrayList<Person>();
  }
  
  public void insert(Person p){
    persons.add(p); //인터페이스의 인아웃은 정해져 있는데 JDBC에서 구현되는 방식을 분리해놓음.
                    //여기서는 List니까 add
  }
  
  public List<Person> findAll(){
    return persons;
  }
  
  public Person findById(int id){
    return persons.get(id);   //List의 get함수 알아보기. 아마도 id로 불러오는 거인 듯.
  }
  
  public void update(Person p){ //밑에가 setName이므로 실상 updateName함수가 되어야 함.
    persons.get(p.getId()).setName(p.getName());
  }
  
  public void delete(int id){
    persons.remove(id);
  }
  
  public void delete(Person p){
    persons.remove(p.getId());
  }
  
}