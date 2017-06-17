package headfirst.state.gumballstate;

public class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gm){
      this.gumballMachine = gm;
    }
    
    public void insertQuarter(){
      System.out.println("already giving gumballs...");
    }
    
    public void ejectQuarter(){
      System.out.println("You can't take money now");
    }
    
    public void turnCrank(){
      System.out.println("Stop turning");
    }
    
    public void dispense(){
      gumballMachine.releaseBall();
      if(gumballMachine.getCount()>0)
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      else
        gumballMachine.setState(gumballMachine.getSoldOutState());        
    }
    
    public String toString() {
      return "dispensing a gumball";
    }
  
}