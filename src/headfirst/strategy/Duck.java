package headfirst.strategy;

public abstract class Duck {
 protected FlyBehavior flyBehavior;//속성에 private을 붙이는 것 = encapsulation
 protected QuackBehavior quackBehavior;
 
 public Duck() {
 }
 
 public void setFlyBehavior (FlyBehavior fb) {
  flyBehavior = fb;
 }
 
 public void setQuackBehavior(QuackBehavior qb) {
  quackBehavior = qb;
 }
 
 abstract void display(); //함수 하나이상이 abstract이면 클래스가 abstract임
//나중에 Duck을 상속받는 클래스가 있다면 반드시 이 함수를 디테일하게 구현해야함.
 
 public void performFly() {
  flyBehavior.fly();
 }
 
 public void performQuack() {
  quackBehavior.quack();
 }
 
 public void swim() {
  System.out.println("All ducks float, even decoys!");
 }
 
}