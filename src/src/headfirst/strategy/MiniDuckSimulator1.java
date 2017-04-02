package headfirst.strategy;

public class MiniDuckSimulator1{
  public static void main(String[] args){
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performFly();
    mallard.performQuack();    
    mallard.swim();
    mallard.setFlyBehavior(new FlyWithWings());
    mallard.performFly();
    mallard.performQuack();
    
    System.out.println();
    
    Duck model = new ModelDuck();
    model.display();
    model.performFly();
    model.performQuack();
    model.swim();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}