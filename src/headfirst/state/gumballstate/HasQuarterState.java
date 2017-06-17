package headfirst.state.gumballstate;

public class HasQuarterState implements State {
  GumballMachine gumballMachine;
  
  public HasQuarterState(GumballMachine gm){//인자로 context가 와야함.
    this.gumballMachine = gm;
  }
    
  public void insertQuarter(){
    System.out.println("you can NOT insert anoter quarter");    
  }
  public void ejectQuarter(){
    System.out.println("quarter returned..");
    //gumballMachine.setState(new NoQuarterState());//이렇게 해줘도 되지만 context이용해서 넣는 게 더 좋음.
    gumballMachine.setState(gumballMachine.getNoQuarterState());
    //context에서 중앙관리를 한다. 그래서 transit을 시켜주는 것.
  }
  public void turnCrank(){
    System.out.println("you turned..");
    gumballMachine.setState(gumballMachine.getSoldState());  
  }
  public void dispense(){
    System.out.println("No gumball dispensed...");  
  }  
  public String toString() {
    return "waiting for turn of crank";
  }  
}