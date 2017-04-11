package headfirst.decorator.starbuzz;

public class Soy extends CondimentDecorator {
 Beverage beverage;

 public Soy(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", with Soy milk";
 }

 public double cost() {
  return 1.30 + beverage.cost();
 }
}