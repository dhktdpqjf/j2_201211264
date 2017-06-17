package headfirst.state.gumballstate;

public interface State {
  //State는 실무에서 DB에 들어감. 그치만 컴퓨터를 끄면 저장되는 게 아님.
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}