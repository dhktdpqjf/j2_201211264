package headfirst.state.gumballstate;

public class NoQuarterState implements State {
  GumballMachine gm;
  
  public NoQuarterState(GumballMachine gm){//인자로 context가 와야함.
    this.gm = gm;
  }
  
  public void insertQuarter(){
    System.out.println("inserting quarter..");
    gm.setState(gm.getHasQuarterState());
  }
  
  public void ejectQuarter(){
    System.out.println("No quarter now..");
  }
  
  public void turnCrank(){
    System.out.println("no quarter now.. can't dispense gumballs..");
  }
  
  public void dispense(){
    System.out.println("we can't dispense gumballs..");
  }
  
  public String toString(){
    return "waiting for quarter";
 }
}