package headfirst.decorator.starbuzz;

public class Milk extends CondimentDecorator {
 Beverage beverage;

 public Milk(Beverage beverage) {
  this.beverage=beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", with Milk";
 }

 public double cost() {
  return 0.80 + beverage.cost();
 }
}