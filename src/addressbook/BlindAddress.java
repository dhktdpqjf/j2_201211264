package addressbook;

public class BlindAddress implements BlindData{
  public void blind(String name){
    System.out.println(name + "의 주소를 비공개합니다.");
   // setAddress("비공개");
    //address = "비공개";
    //display();
  }
  
  public String getData(){
    return "비공개 주소";
  }
}