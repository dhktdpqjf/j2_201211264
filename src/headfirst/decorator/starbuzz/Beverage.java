package headfirst.decorator.starbuzz;

public abstract class Beverage { //abstract �Լ� �����ϱ� abstract class
  
 String description = "Unknown Beverage";
  
 public String getDescription() {
  return description;
 }
 public abstract double cost();//������ �ڷ� �̷� �Ŵϱ� abstract
 
}