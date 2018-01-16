package com.sd.dao.v1;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
  List<Person> persons;
  
  public PersonDaoImpl(){
    persons = new ArrayList<Person>();
  }
  
  public void insert(Person p){
    persons.add(p); //�������̽��� �ξƿ��� ������ �ִµ� JDBC���� �����Ǵ� ����� �и��س���.
                    //���⼭�� List�ϱ� add
  }
  
  public List<Person> findAll(){
    return persons;
  }
  
  public Person findById(int id){
    return persons.get(id);   //List�� get�Լ� �˾ƺ���. �Ƹ��� id�� �ҷ����� ���� ��.
  }
  
  public void update(Person p){ //�ؿ��� setName�̹Ƿ� �ǻ� updateName�Լ��� �Ǿ�� ��.
    persons.get(p.getId()).setName(p.getName());
  }
  
  public void delete(int id){
    persons.remove(id);
  }
  
  public void delete(Person p){
    persons.remove(p.getId());
  }
  
}