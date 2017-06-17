package headfirst.state.gumballstate;

public class GumballMachine {
  /*
   final static int SOLD_OUT = 0; 
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD = 3;*/
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;  
  
  //int state = SOLD_OUT; 
  State state = soldOutState;
  int count = 0;
  
  public GumballMachine (int count){
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    this.count =  count;
    if(count >0)
      state = noQuarterState;
  }
  
  public void insertQuarter(){
    //state패턴을 쓰면 if문이 없어짐 -> 가용성?다형성? 때문에. 
    state.insertQuarter(); //이렇게 해줘야 함.
    /*//얘네는 다 sub함수로 나뉘어지게 됨
    if(state == HAS_QUARTER){
      System.out.println("you can NOT insert anoter quarter");
    }else if(state == NO_QUARTER){
      state = HAS_QUARTER;
      System.out.println("you inserted quarter");
    }else if(state == SOLD_OUT){
      System.out.println("take your quarter. No candies");
    }else if(state == SOLD){
      System.out.println("please wait..");
    }*/
  }
  public void ejectQuarter() {
        state.ejectQuarter();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}