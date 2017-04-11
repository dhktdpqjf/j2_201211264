package addressbook;

public class BlindNum implements BlindData{
  public void blind(String name){
    System.out.println(name+"의 번호를 비공개합니다.");
    //num = "비공개";
  }
  public String getData(){
    return "비공개 번호";
  }
}