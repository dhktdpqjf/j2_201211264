package headfirst.singleton.chocolate;

public class ChocolateBoiler{  
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  static int numCalled=0; //static함수인 getInstance에서 쓰기 때문에 이 변수값도 static이어야 함.
 
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }
  
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance == null){
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("number called : "+numCalled++);
    return uniqueInstance;        
  }
  
  public void fill(){
    if(isEmpty()){
      empty = false;
      boiled = false;
      //System.out.println("empty? "+empty +" boiled?" +boiled);
    }
  }
  
  public void drain(){
    if(isEmpty() && isBoiled())
      empty = true;
    System.out.println("draining...");
  }
  
  public void boil(){
    if(isEmpty() &&isBoiled())
      boiled = true;
  }
  
  public boolean isEmpty(){
    return empty;
  }  
  
  public boolean isBoiled(){
    return boiled;
  }
}