package headfirst.decorator.starbuzz;

public abstract class Beverage { //abstract 함수 있으니까 abstract class
  
 String description = "Unknown Beverage";
  
 public String getDescription() {
  return description;
 }
 public abstract double cost();//구현을 뒤로 미룰 거니까 abstract
 
}