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
 
 public void performFly() {
  flyBehavior.fly();
 }
 
 public void performQuack() {
  quackBehavior.quack();
 }
 
 public void swim() {
  System.out.println("All ducks float, even decoys!");
 }
 
 public static void main (String[] args){
 }
}