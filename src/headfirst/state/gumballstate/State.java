package headfirst.state.gumballstate;

public interface State {
  //State�� �ǹ����� DB�� ��. ��ġ�� ��ǻ�͸� ���� ����Ǵ� �� �ƴ�.
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}