package headfirst.decorator.starbuzz;

public class DarkRoast extends Beverage {
 public DarkRoast() {
  description = "DarkRoast Coffee";
 }
 
 public double cost() {
  return 3.20;
 }
}