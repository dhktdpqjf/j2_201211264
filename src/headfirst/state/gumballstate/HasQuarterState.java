package headfirst.state.gumballstate;

public class HasQuarterState implements State {
  GumballMachine gumballMachine;
  
  public HasQuarterState(GumballMachine gm){//���ڷ� context�� �;���.
    this.gumballMachine = gm;
  }
    
  public void insertQuarter(){
    System.out.println("you can NOT insert anoter quarter");    
  }
  public void ejectQuarter(){
    System.out.println("quarter returned..");
    //gumballMachine.setState(new NoQuarterState());//�̷��� ���൵ ������ context�̿��ؼ� �ִ� �� �� ����.
    gumballMachine.setState(gumballMachine.getNoQuarterState());
    //context���� �߾Ӱ����� �Ѵ�. �׷��� transit�� �����ִ� ��.
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