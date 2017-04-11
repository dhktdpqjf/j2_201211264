package headfirst.decorator.starbuzz;

public class Syrup extends CondimentDecorator {
 Beverage beverage;
 String syrup;

 public Syrup(Beverage beverage, String syrup) {
  this.beverage=beverage;
  this.syrup = syrup;
 }
 

 public String getDescription() {
  return beverage.getDescription() + ", adding " + syrup +" Syrup";
 }

 public double cost() {
  return .05 + beverage.cost();
 }
}