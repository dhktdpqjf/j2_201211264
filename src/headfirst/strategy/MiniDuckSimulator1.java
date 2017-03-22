package headfirst.strategy;

public class MiniDuckSimulator1{
  public static void main(String[] args){
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
    //mallard.display();
    
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyWithWings());
    model.performFly();
  }
}