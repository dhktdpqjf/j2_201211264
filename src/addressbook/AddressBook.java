package addressbook;

public class AddressBook implements Observer, DisplayAttribute{ 
  private String name;
  protected String num; 
  protected String address; 
  private int age;
  Subject adbook;
  BlindData bd;
  
  public AddressBook(Subject ad){
    this.adbook = ad;
    ad.registerObserver(this);
  }
  
  public void update(String name, String num, String address, int age){
    this.name = name;
    this.num = num;
    this.address = address;
    this.age = age;
    display();
  }
  
  public void setBlindData(BlindData bd){
    this.bd = bd;
  }
  
  public void getBlindData(){
    bd.blind(name);
    this.address = bd.getData();
    display();
  }
  
  public void display(){
    System.out.println("이름: "+name+"\t 전화번호: "+num+" 주소: "
                         +address+"\t 나이: " +age);
  }
}