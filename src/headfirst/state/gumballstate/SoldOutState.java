package headfirst.state.gumballstate;

public class SoldOutState implements State {
  GumballMachine gm;
  
  public SoldOutState(GumballMachine gm){//인자로 context가 와야함.
    this.gm = gm;
  }
  
  public void insertQuarter(){
    System.out.println("Don't insert quarter.. Sold out now.. ");
  }
  public void ejectQuarter() {
  System.out.println("You can't eject, you haven't inserted a quarter yet");
 }
 
  public void turnCrank() {
    System.out.println("You turned, but there are no gumballs");
  }
 
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
  
  public String toString() {
    return "sold out";
  }
}