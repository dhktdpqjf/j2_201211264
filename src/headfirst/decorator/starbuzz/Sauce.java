package headfirst.decorator.starbuzz;

public class Sauce extends CondimentDecorator {
 Beverage beverage;
 String sauce;

 public Sauce(Beverage beverage, String sauce) {
  this.beverage=beverage;
  this.sauce = sauce;
 }
 

 public String getDescription() {
  return beverage.getDescription() + ", adding " + sauce +" Sauce";
 }

 public double cost() {
  return .03 + beverage.cost();
 }
}