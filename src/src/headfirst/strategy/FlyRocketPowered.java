package headfirst.strategy;

public class FlyRocketPowered implements FlyBehavior {
  public void fly(){
    System.out.println("rocket-powered flying!");
  }
}